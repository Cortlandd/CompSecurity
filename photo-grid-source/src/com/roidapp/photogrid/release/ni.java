// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ng

final class ni
    implements android.view.View.OnClickListener
{

    final ng a;

    ni(ng ng1)
    {
        a = ng1;
        super();
    }

    public final void onClick(View view)
    {
        b.a("Video/Preview/Click");
        a.n();
    }
}
