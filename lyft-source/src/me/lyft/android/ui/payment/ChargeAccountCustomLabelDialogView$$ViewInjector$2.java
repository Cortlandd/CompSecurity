// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountCustomLabelDialogView

class val.target extends DebouncingOnClickListener
{

    final ick this$0;
    final ChargeAccountCustomLabelDialogView val$target;

    public void doClick(View view)
    {
        val$target.onCancelButtonClick();
    }

    ()
    {
        this$0 = final_;
        val$target = ChargeAccountCustomLabelDialogView.this;
        super();
    }
}
