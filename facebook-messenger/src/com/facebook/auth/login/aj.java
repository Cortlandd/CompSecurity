// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;

// Referenced classes of package com.facebook.auth.login:
//            GenericPasswordCredentialsViewGroup

class aj
    implements android.view.View.OnClickListener
{

    final GenericPasswordCredentialsViewGroup a;

    aj(GenericPasswordCredentialsViewGroup genericpasswordcredentialsviewgroup)
    {
        a = genericpasswordcredentialsviewgroup;
        super();
    }

    public void onClick(View view)
    {
        a.onSignupClick();
    }
}
