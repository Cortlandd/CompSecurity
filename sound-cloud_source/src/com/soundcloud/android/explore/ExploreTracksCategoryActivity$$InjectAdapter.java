// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreTracksCategoryActivity

public final class Q extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/explore/ExploreTracksCategoryActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/explore/ExploreTracksCategoryActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/explore/ExploreTracksCategoryActivity, getClass().getClassLoader(), false);
    }

    public final ExploreTracksCategoryActivity get()
    {
        ExploreTracksCategoryActivity exploretrackscategoryactivity = new ExploreTracksCategoryActivity();
        injectMembers(exploretrackscategoryactivity);
        return exploretrackscategoryactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(ExploreTracksCategoryActivity exploretrackscategoryactivity)
    {
        exploretrackscategoryactivity.playerController = (PlayerController)playerController.get();
        exploretrackscategoryactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(exploretrackscategoryactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreTracksCategoryActivity)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.explore.ExploreTracksCategoryActivity", "members/com.soundcloud.android.explore.ExploreTracksCategoryActivity", false, com/soundcloud/android/explore/ExploreTracksCategoryActivity);
    }
}
