// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

private static abstract class <init> extends com.google.android.gms.games.boxCountImpl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.Notifications.InboxCountResult() {

            final NotificationsImpl.InboxCountImpl this$0;
            final Status val$status;

            public final int getActivityCount(String s)
            {
                return 0;
            }

            public final Status getStatus()
            {
                return status;
            }

            public final int getTotalCount()
            {
                return 0;
            }

            public final boolean hasNewActivity()
            {
                return false;
            }

            
            {
                this$0 = NotificationsImpl.InboxCountImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.val.status(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
