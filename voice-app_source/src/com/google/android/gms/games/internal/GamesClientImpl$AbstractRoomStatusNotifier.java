// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class  extends zzb
{

    protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
    {
        zza(roomstatusupdatelistener, GamesClientImpl.zzV(dataholder));
    }

    protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

    protected volatile void zza(Object obj, DataHolder dataholder)
    {
        zza((RoomStatusUpdateListener)obj, dataholder);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
    }
}
