// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.view.View;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.v5:
//            MobileConnectWarningDialog, c

class a
    implements android.view.Dialog._cls2
{

    final MobileConnectWarningDialog a;

    public void onClick(View view)
    {
        com.qihoo.security.v5.c.a(MobileConnectWarningDialog.e(a));
        if (MobileConnectWarningDialog.b(a))
        {
            com.qihoo360.mobilesafe.b.a.e(MobileConnectWarningDialog.f(a));
        }
        a.finish();
    }

    (MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        a = mobileconnectwarningdialog;
        super();
    }
}
