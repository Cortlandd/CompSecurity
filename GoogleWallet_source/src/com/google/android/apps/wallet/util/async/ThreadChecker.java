// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;


// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ThreadPreconditions

public class ThreadChecker
{

    public ThreadChecker()
    {
    }

    public static void checkOnBackgroundThread()
    {
        ThreadPreconditions.checkOnBackgroundThread();
    }

    public static void checkOnUiThread()
    {
        ThreadPreconditions.checkOnUiThread();
    }
}
