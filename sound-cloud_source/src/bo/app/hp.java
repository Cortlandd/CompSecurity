// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            hi, hg, fa

final class hp extends hi
    implements Serializable
{

    static final hp a = new hp();

    private hp()
    {
    }

    public final hi a()
    {
        return hg.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        fa.a(obj);
        if (obj == obj1)
        {
            return 0;
        } else
        {
            return ((Comparable) (obj1)).compareTo(obj);
        }
    }

    public final String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
