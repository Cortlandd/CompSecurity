// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;

public interface pk
    extends IInterface
{
    public static abstract class a extends Binder
        implements pk
    {

        public static pk cq(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (iinterface != null && (iinterface instanceof pk))
            {
                return (pk)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR;
                    parcel1 = e.bO(parcel);
                }
                Z(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR;
                    parcel1 = e.bO(parcel);
                }
                aa(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj2;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = DataHolder.CREATOR;
                parcel1 = e.bO(parcel);
            }
            ab(parcel1);
            return true;
        }
    }

    static final class a.a
        implements pk
    {

        private IBinder ld;

        public final void Z(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            ld.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public final void aa(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            ld.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public final void ab(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            ld.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public final IBinder asBinder()
        {
            return ld;
        }

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract void Z(DataHolder dataholder)
        throws RemoteException;

    public abstract void aa(DataHolder dataholder)
        throws RemoteException;

    public abstract void ab(DataHolder dataholder)
        throws RemoteException;
}
