// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.payments.LoginActivity;
import java.util.List;

public final class bzd
    implements android.view.View.OnClickListener
{

    final bvk a;
    final List b;
    final LoginActivity c;

    public bzd(LoginActivity loginactivity, bvk bvk, List list)
    {
        c = loginactivity;
        a = bvk;
        b = list;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(bux.a(buz.aX)).setAdapter(a, new bze(this));
        view.create().show();
    }
}
