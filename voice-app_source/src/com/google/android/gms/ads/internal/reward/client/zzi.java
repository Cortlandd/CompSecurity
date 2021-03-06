// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzb, zzg

public class zzi
    implements RewardedVideoAd
{

    private final Context mContext;
    private String zzEO;
    private RewardedVideoAdListener zzES;
    private final com.google.android.gms.ads.internal.reward.client.zzb zzET;
    private final Object zzqt = new Object();

    public zzi(Context context, com.google.android.gms.ads.internal.reward.client.zzb zzb1)
    {
        zzET = zzb1;
        mContext = context;
    }

    public void destroy()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzET.destroy();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward destroy to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public RewardedVideoAdListener getRewardedVideoAdListener()
    {
        RewardedVideoAdListener rewardedvideoadlistener;
        synchronized (zzqt)
        {
            rewardedvideoadlistener = zzES;
        }
        return rewardedvideoadlistener;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getUserId()
    {
        String s;
        synchronized (zzqt)
        {
            s = zzEO;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isLoaded()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return false;
        }
        boolean flag = zzET.isLoaded();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward isLoaded to RewardedVideoAd", remoteexception);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public void loadAd(String s, AdRequest adrequest)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzET.zza(zzg.zzcw().zza(mContext, adrequest.zzaF(), s));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        zzb.zzd("Could not forward loadAd to RewardedVideoAd", s);
          goto _L1
    }

    public void pause()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzET.pause();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward pause to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public void resume()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzET.resume();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward resume to RewardedVideoAd", remoteexception);
          goto _L1
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzES == null)
                {
                    break label0;
                }
                zzb.zzaC("A RewardedVideoAdListener has already been set, ignoring.");
            }
            return;
        }
        com.google.android.gms.ads.internal.reward.client.zzb zzb1;
        zzES = rewardedvideoadlistener;
        zzb1 = zzET;
        if (zzb1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        zzET.zza(new com.google.android.gms.ads.internal.reward.client.zzg(rewardedvideoadlistener));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        rewardedvideoadlistener;
        obj;
        JVM INSTR monitorexit ;
        throw rewardedvideoadlistener;
        rewardedvideoadlistener;
        zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", rewardedvideoadlistener);
          goto _L1
    }

    public void setUserId(String s)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (TextUtils.isEmpty(zzEO))
                {
                    break label0;
                }
                zzb.zzaC("A user id has already been set, ignoring.");
            }
            return;
        }
        com.google.android.gms.ads.internal.reward.client.zzb zzb1;
        zzEO = s;
        zzb1 = zzET;
        if (zzb1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        zzET.setUserId(s);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        zzb.zzd("Could not forward setUserId to RewardedVideoAd", s);
          goto _L1
    }

    public void show()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzET != null)
                {
                    break label0;
                }
            }
            return;
        }
        zzET.show();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward show to RewardedVideoAd", remoteexception);
          goto _L1
    }
}
