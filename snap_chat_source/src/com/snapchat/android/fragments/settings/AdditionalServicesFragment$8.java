// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import android.widget.CompoundButton;
import com.snapchat.android.analytics.AnalyticsEvents;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            AdditionalServicesFragment

final class a
    implements android.widget.eListener
{

    private AdditionalServicesFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        AdditionalServicesFragment.b(a);
        Bt.k(flag);
        AnalyticsEvents.a("TOGGLE_SETTING_FLASH", flag);
    }

    (AdditionalServicesFragment additionalservicesfragment)
    {
        a = additionalservicesfragment;
        super();
    }
}
