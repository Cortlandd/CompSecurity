// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.appboy.Appboy;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class val.event
    implements Runnable
{

    final hLayout.setRefreshing this$1;
    final FeedUpdatedEvent val$event;

    public void run()
    {
        AppboyLogger.d(AppboyFeedFragment.access$700(), (new StringBuilder()).append("Updating feed views in response to FeedUpdatedEvent: ").append(val$event).toString());
        AppboyFeedFragment.access$900(_fld0).removeCallbacks(AppboyFeedFragment.access$800(_fld0));
        AppboyFeedFragment.access$100(_fld0).setVisibility(8);
        if (val$event.getCardCount(AppboyFeedFragment.access$1000(_fld0)) == 0)
        {
            listView.setVisibility(8);
            AppboyFeedFragment.access$500(_fld0).clear();
        } else
        {
            AppboyFeedFragment.access$1100(_fld0).setVisibility(8);
            AppboyFeedFragment.access$000(_fld0).setVisibility(8);
            AppboyFeedFragment.access$1200(_fld0).setVisibility(8);
        }
        if (val$event.isFromOfflineStorage() && (val$event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
        {
            AppboyLogger.i(AppboyFeedFragment.access$700(), String.format("Feed received was older than the max time to live of %d seconds, displaying it for now, but requesting an updated view from the server.", new Object[] {
                Integer.valueOf(60)
            }));
            AppboyFeedFragment.access$1300(_fld0).requestFeedRefresh();
            if (val$event.getCardCount(AppboyFeedFragment.access$1000(_fld0)) == 0)
            {
                AppboyLogger.d(AppboyFeedFragment.access$700(), String.format("Old feed was empty, putting up a network spinner and registering the network error message on a delay of %dms.", new Object[] {
                    Integer.valueOf(5000)
                }));
                AppboyFeedFragment.access$1100(_fld0).setVisibility(8);
                AppboyFeedFragment.access$000(_fld0).setVisibility(0);
                AppboyFeedFragment.access$1200(_fld0).setVisibility(0);
                AppboyFeedFragment.access$900(_fld0).postDelayed(AppboyFeedFragment.access$800(_fld0), 5000L);
                return;
            }
        }
        if (val$event.getCardCount(AppboyFeedFragment.access$1000(_fld0)) == 0)
        {
            AppboyFeedFragment.access$000(_fld0).setVisibility(8);
            AppboyFeedFragment.access$1100(_fld0).setVisibility(0);
            AppboyFeedFragment.access$1200(_fld0).setVisibility(0);
        } else
        {
            AppboyFeedFragment.access$500(_fld0).replaceFeed(val$event.getFeedCards(AppboyFeedFragment.access$1000(_fld0)));
            listView.setVisibility(0);
        }
        AppboyFeedFragment.access$300(_fld0).setRefreshing(false);
    }

    l.listView()
    {
        this$1 = final_listview;
        val$event = FeedUpdatedEvent.this;
        super();
    }

    // Unreferenced inner class com/appboy/ui/AppboyFeedFragment$5

/* anonymous class */
    class AppboyFeedFragment._cls5
        implements IEventSubscriber
    {

        final AppboyFeedFragment this$0;
        final ListView val$listView;

        public void trigger(FeedUpdatedEvent feedupdatedevent)
        {
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity == null)
            {
                return;
            } else
            {
                fragmentactivity.runOnUiThread(feedupdatedevent. new AppboyFeedFragment._cls5._cls1());
                return;
            }
        }

        public volatile void trigger(Object obj)
        {
            trigger((FeedUpdatedEvent)obj);
        }

            
            {
                this$0 = final_appboyfeedfragment;
                listView = ListView.this;
                super();
            }
    }

}
