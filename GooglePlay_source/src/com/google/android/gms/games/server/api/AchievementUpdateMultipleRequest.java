// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            AchievementUpdateRequest

public final class AchievementUpdateMultipleRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;

    public AchievementUpdateMultipleRequest()
    {
        mConcreteTypeArrays = new HashMap();
    }

    public AchievementUpdateMultipleRequest(ArrayList arraylist)
    {
        mConcreteTypeArrays = new HashMap();
        if (arraylist != null)
        {
            addConcreteTypeArray("updates", arraylist);
        }
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getUpdates()
    {
        return (ArrayList)mConcreteTypeArrays.get("updates");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("updates", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("updates", com/google/android/gms/games/server/api/AchievementUpdateRequest));
    }
}
