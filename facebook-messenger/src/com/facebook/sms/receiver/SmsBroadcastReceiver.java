// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sms.receiver;

import com.facebook.c.k;
import com.facebook.sms.annotation.HighPriHandler;

// Referenced classes of package com.facebook.sms.receiver:
//            a

public class SmsBroadcastReceiver extends k
{

    private static final Class a = com/facebook/sms/receiver/SmsBroadcastReceiver;

    public SmsBroadcastReceiver()
    {
        super("android.provider.Telephony.SMS_RECEIVED", new a(com/facebook/sms/annotation/HighPriHandler));
    }

}
