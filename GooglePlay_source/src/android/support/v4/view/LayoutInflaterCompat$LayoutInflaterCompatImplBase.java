// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterCompat, LayoutInflaterFactory

static class 
    implements 
{

    public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        if (layoutinflaterfactory != null)
        {
            layoutinflaterfactory = new (layoutinflaterfactory);
        } else
        {
            layoutinflaterfactory = null;
        }
        layoutinflater.setFactory(layoutinflaterfactory);
    }

    ()
    {
    }
}
