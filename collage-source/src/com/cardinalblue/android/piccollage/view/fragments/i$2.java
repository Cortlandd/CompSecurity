// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.d;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class a
    implements a
{

    final i a;

    public void a(int j, int k, int l)
    {
        com.cardinalblue.android.piccollage.view.fragments.i.a(a, a.b.c(), new i.a() {

            final i._cls2 a;

            public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
            {
                boolean flag = true;
                a.a.k.a();
                if (exception != null)
                {
                    if (!a.a.a(exception))
                    {
                        a.a.d();
                        com.cardinalblue.android.b.k.a(a.a.getActivity(), 0x7f0700f8, 1);
                    }
                } else
                if (cbcollagesresponse != null)
                {
                    boolean flag1 = cbcollagesresponse.getListRevision().equals(com.cardinalblue.android.piccollage.view.fragments.i.a(a.a));
                    if (a.a.b.getItemCount() != 0)
                    {
                        flag = false;
                    }
                    com.cardinalblue.android.piccollage.view.fragments.i.a(a.a, cbcollagesresponse.getListRevision());
                    if (flag1 && !flag)
                    {
                        a.a.b.b(cbcollagesresponse);
                        a.a.k.setCanLoadMore(a.a.b.g());
                        a.a.b.notifyDataSetChanged();
                        a.a.c(cbcollagesresponse);
                        a.a.a();
                        return;
                    }
                }
            }

            
            {
                a = i._cls2.this;
                super();
            }
        });
    }

    _cls1.a(i j)
    {
        a = j;
        super();
    }
}
