// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, locationrequest.mPriority);
        b.a(parcel, 1000, locationrequest.getVersionCode());
        b.a(parcel, 2, locationrequest.Cq);
        b.a(parcel, 3, locationrequest.Cr);
        b.a(parcel, 4, locationrequest.Cs);
        b.a(parcel, 5, locationrequest.Cj);
        b.a(parcel, 6, locationrequest.Ct);
        b.a(parcel, 7, locationrequest.Cu);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 102;
        long l3 = 0x36ee80L;
        long l2 = 0x927c0L;
        long l1 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l3, l2, flag, l1, i, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationRequest[i];
    }
}
