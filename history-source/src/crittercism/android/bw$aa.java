// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package crittercism.android:
//            bv, bw

public static final class s.ydpi
    implements bv
{

    private Float a;

    public final String a()
    {
        return "ydpi";
    }

    public final volatile Object b()
    {
        return a;
    }

    public s()
    {
        a = null;
        bw.b();
        a = Float.valueOf(bw.b().getResources().getDisplayMetrics().ydpi);
    }
}
