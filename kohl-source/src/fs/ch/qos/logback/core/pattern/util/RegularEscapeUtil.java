// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.util;


// Referenced classes of package fs.ch.qos.logback.core.pattern.util:
//            IEscapeUtil

public class RegularEscapeUtil
    implements IEscapeUtil
{

    public RegularEscapeUtil()
    {
    }

    public static String basicEscape(String s)
    {
        int l = s.length();
        StringBuffer stringbuffer = new StringBuffer(l);
        int i = 0;
        while (i < l) 
        {
            int j = i + 1;
            char c = s.charAt(i);
            if (c == '\\')
            {
                int k = j + 1;
                char c1 = s.charAt(j);
                if (c1 == 'n')
                {
                    c = '\n';
                    i = k;
                } else
                if (c1 == 'r')
                {
                    c = '\r';
                    i = k;
                } else
                if (c1 == 't')
                {
                    c = '\t';
                    i = k;
                } else
                {
                    c = c1;
                    i = k;
                    if (c1 == 'f')
                    {
                        c = '\f';
                        i = k;
                    }
                }
            } else
            {
                i = j;
            }
            stringbuffer.append(c);
        }
        return stringbuffer.toString();
    }

    public void escape(String s, StringBuffer stringbuffer, char c, int i)
    {
        if (s.indexOf(c) < 0) goto _L2; else goto _L1
_L1:
        stringbuffer.append(c);
_L4:
        return;
_L2:
        switch (c)
        {
        default:
            s = formatEscapeCharsForListing(s);
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal char '").append(c).append(" at column ").append(i).append(". Only \\\\, \\_").append(s).append(", \\t, \\n, \\r combinations are allowed as escape characters.").toString());

        case 92: // '\\'
            stringbuffer.append(c);
            return;

        case 116: // 't'
            stringbuffer.append('\t');
            return;

        case 114: // 'r'
            stringbuffer.append('\r');
            return;

        case 110: // 'n'
            stringbuffer.append('\n');
            return;

        case 95: // '_'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    String formatEscapeCharsForListing(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            stringbuilder.append(", \\").append(s.charAt(i));
        }

        return stringbuilder.toString();
    }
}
