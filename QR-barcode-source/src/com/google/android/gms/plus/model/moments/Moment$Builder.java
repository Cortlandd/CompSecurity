// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.nu;
import com.google.android.gms.internal.nw;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment, ItemScope

public static class 
{

    private String BL;
    private String amP;
    private nu amX;
    private nu amY;
    private final Set amc = new HashSet();
    private String uO;

    public Moment build()
    {
        return new nw(amc, BL, amX, amP, amY, uO);
    }

    public uO setId(String s)
    {
        BL = s;
        amc.add(Integer.valueOf(2));
        return this;
    }

    public amc setResult(ItemScope itemscope)
    {
        amX = (nu)itemscope;
        amc.add(Integer.valueOf(4));
        return this;
    }

    public amc setStartDate(String s)
    {
        amP = s;
        amc.add(Integer.valueOf(5));
        return this;
    }

    public amc setTarget(ItemScope itemscope)
    {
        amY = (nu)itemscope;
        amc.add(Integer.valueOf(6));
        return this;
    }

    public amc setType(String s)
    {
        uO = s;
        amc.add(Integer.valueOf(7));
        return this;
    }

    public ()
    {
    }
}
