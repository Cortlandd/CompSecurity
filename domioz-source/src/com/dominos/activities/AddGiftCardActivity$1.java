// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            AddGiftCardActivity

class allback extends com.dominos.utils.tionCallback
{

    final AddGiftCardActivity this$0;

    public void onAlertDismissed()
    {
        updateViews();
    }

    allback()
    {
        this$0 = AddGiftCardActivity.this;
        super();
    }
}
