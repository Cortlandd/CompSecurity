// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.r;

public class a extends android.view.SupportActionBar.LayoutParams
{

    public int a;

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        context = context.obtainStyledAttributes(attributeset, r.d);
        a = context.getInt(0, -1);
        context.recycle();
    }
}
