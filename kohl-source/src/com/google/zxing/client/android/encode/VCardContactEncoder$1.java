// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.encode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.encode:
//            Formatter, VCardContactEncoder

static final class 
    implements Formatter
{

    public String format(String s)
    {
        return VCardContactEncoder.access$100().matcher(VCardContactEncoder.access$000().matcher(s).replaceAll("\\\\$1")).replaceAll("");
    }

    ()
    {
    }
}
