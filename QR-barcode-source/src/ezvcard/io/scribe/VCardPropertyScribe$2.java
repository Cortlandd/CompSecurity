// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import java.util.Collection;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

static final class 
    implements ezvcard.util.ck
{

    public void handle(StringBuilder stringbuilder, Object obj)
    {
        if (obj == null)
        {
            return;
        }
        if (obj instanceof Collection)
        {
            stringbuilder.append(VCardPropertyScribe.list((Collection)obj));
            return;
        } else
        {
            stringbuilder.append(VCardPropertyScribe.escape(obj.toString()));
            return;
        }
    }

    ()
    {
    }
}
