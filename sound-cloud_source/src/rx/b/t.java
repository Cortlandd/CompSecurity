// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.b;


// Referenced classes of package rx.b:
//            o, i

final class t
    implements o
{

    final i a;

    t(i j)
    {
        a = j;
        super();
    }

    public final transient Object a(Object aobj[])
    {
        if (aobj.length != 4)
        {
            throw new RuntimeException("Func4 expecting 4 arguments.");
        } else
        {
            return a.a(aobj[0], aobj[1], aobj[2], aobj[3]);
        }
    }
}
