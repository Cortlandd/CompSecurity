// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushManager

class this._cls0 extends BroadcastReceiver
{

    final RichPushManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        refreshMessages();
    }

    ()
    {
        this$0 = RichPushManager.this;
        super();
    }
}
