// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Ow extends AbstractGamesCallbacks
{

    final GamesClientImpl NB;
    private final OnRequestReceivedListener Ow;

    public void o(DataHolder dataholder)
    {
        GameRequestBuffer gamerequestbuffer;
        gamerequestbuffer = new GameRequestBuffer(dataholder);
        dataholder = null;
        if (gamerequestbuffer.getCount() > 0)
        {
            dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
        }
        gamerequestbuffer.close();
        if (dataholder != null)
        {
            NB.a(new (NB, Ow, dataholder));
        }
        return;
        dataholder;
        gamerequestbuffer.close();
        throw dataholder;
    }

    public void onRequestRemoved(String s)
    {
        NB.a(new NB(NB, Ow, s));
    }

    Y(GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener)
    {
        NB = gamesclientimpl;
        super();
        Ow = onrequestreceivedlistener;
    }
}
