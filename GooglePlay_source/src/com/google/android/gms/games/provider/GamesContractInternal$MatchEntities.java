// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesContractInternal

public static final class 
    implements BaseColumns, com.google.android.gms.games.internal., com.google.android.gms.games.internal.
{

    public static Uri getContentUri(ClientContext clientcontext)
    {
        return uilder(clientcontext, "match_entities").text();
    }

    public static Uri getUriForExternalMatchId(ClientContext clientcontext, String s)
    {
        return uilder(clientcontext, "match_entities").text("ext_match").text(s).text();
    }
}
