// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.feedback.LogOptions;

public final class koz
    implements android.os.Parcelable.Creator
{

    public koz()
    {
    }

    public static void a(LogOptions logoptions, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, logoptions.a);
        b.a(parcel, 2, logoptions.b, false);
        b.a(parcel, 3, logoptions.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = b.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogOptions(i, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LogOptions[i];
    }
}
