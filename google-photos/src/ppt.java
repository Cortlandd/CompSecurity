// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppt extends qlq
{

    private String a;
    private String b;
    private String c;

    public ppt()
    {
        a = null;
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a() + qlp.b(1, a) + qlp.b(2, b);
        int i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (super.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        qlp1.a(2, b);
        if (c != null)
        {
            qlp1.a(3, c);
        }
        super.a(qlp1);
    }
}
