// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

final class c extends ThreadLocal
{

    c()
    {
    }

    private DateFormat a()
    {
        this;
        JVM INSTR monitorenter ;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        this;
        JVM INSTR monitorexit ;
        return simpledateformat;
        Exception exception;
        exception;
        throw exception;
    }

    protected final Object initialValue()
    {
        return a();
    }
}
