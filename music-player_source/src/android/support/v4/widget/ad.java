// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            ah, SwipeRefreshLayout

final class ad extends ah
{

    final SwipeRefreshLayout a;

    ad(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super(swiperefreshlayout, (byte)0);
    }

    public final void onAnimationEnd(Animation animation)
    {
        SwipeRefreshLayout.f(a);
    }
}
