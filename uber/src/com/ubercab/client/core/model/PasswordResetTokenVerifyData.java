// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public abstract class PasswordResetTokenVerifyData
{

    public PasswordResetTokenVerifyData()
    {
    }

    public abstract String getMobileToken();

    public abstract Boolean getSendToken();

    abstract PasswordResetTokenVerifyData setMobileToken(String s);

    abstract PasswordResetTokenVerifyData setSendToken(Boolean boolean1);
}
