// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.t;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.Distance;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.DistanceDecimalFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui:
//            DistanceChartFragment, FitbitActivityChartActivity

class a
    implements t
{

    final a a;

    public j a(Object obj, j j1)
    {
        return new j((j)obj);
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/fitbit/activity/ui/DistanceChartFragment$1

/* anonymous class */
    class DistanceChartFragment._cls1
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        final DistanceChartFragment a;

        public void a(Loader loader, DistanceChartFragment.a a1)
        {
            AbsActivityChartFragment.a a2 = a.a;
            a.a = null;
            if (!LoadSavedState.b(a.k()))
            {
                a.b(true);
                return;
            }
            if (a1 == null)
            {
                a.a(true);
                return;
            }
            if (a1.a.size() == 0 && ((FitbitActivityChartActivity)a.getActivity()).c())
            {
                a.b(true);
                return;
            }
            a.a = a1;
            com.fitbit.activity.ui.DistanceChartFragment.a(a);
            a.a(a1.c, 2);
            a.a(a1.b);
            Object obj = new DistanceDecimalFormat(a1.d);
            ((DecimalFormat) (obj)).setMaximumFractionDigits(1);
            a.h().a(((java.text.Format) (obj)));
            a.h().p();
            obj = (ChartSeries)a.h().h().a("MAIN_SERIES");
            boolean flag = DistanceChartFragment.b(a);
            ((ChartSeries) (obj)).F().clear();
            ((ChartSeries) (obj)).F().a(a1.a, new DistanceChartFragment._cls1._cls2(this));
            ChartAxisScale chartaxisscale = ((a)a.h().g().get(0)).e().a();
            chartaxisscale.a(Double.valueOf(0.0D));
            chartaxisscale.b(Double.valueOf(a1.f));
            if (a1.i || a2 == null || a.s())
            {
                a.h().t();
                chartaxisscale.c(a1.g, a1.h);
            }
            int i = a1.a.size();
            loader = (com.fitbit.weight.ui.a)loader;
            a.b(loader.l().a());
            com.fitbit.util.chart.a.b(a.h(), loader.h(), loader.i(), loader.l().a(), flag, new List[] {
                ((ChartSeries) (obj)).I()
            });
            a.h().q();
            a.b(false);
            loader = a;
            if (i <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loader.a(flag);
            DistanceChartFragment.c(a);
        }

        public Loader onCreateLoader(int i, Bundle bundle)
        {
            return new DistanceChartFragment._cls1._cls1(a.getActivity(), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE"), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE"), Filter.a(a.k()), new IntentFilter("com.fibit.data.bl.BROADCAST_CHART_UPDATE"));
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (DistanceChartFragment.a)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

            
            {
                a = distancechartfragment;
                super();
            }

        // Unreferenced inner class com/fitbit/activity/ui/DistanceChartFragment$1$1

/* anonymous class */
        class DistanceChartFragment._cls1._cls1 extends com.fitbit.weight.ui.a
        {

            final DistanceChartFragment._cls1 a;

            public Object f_()
            {
                return i_();
            }

            public DistanceChartFragment.a i_()
            {
                Object obj1 = h();
                Object obj = i();
                if (obj1 == null || obj == null)
                {
                    return null;
                }
                DistanceChartFragment.a a1 = new DistanceChartFragment.a(null);
                a1.d = an.a().b().t();
                List list = fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE, ((Date) (obj1)), ((Date) (obj)));
                a1.c = com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, ((Date) (obj)));
                if (a1.c != null && a1.d != com.fitbit.data.domain.Length.LengthUnits.KM)
                {
                    a1.c.a(Double.valueOf((new Length(ValueGoal.b(a1.c), com.fitbit.data.domain.Length.LengthUnits.KM)).a(a1.d).b()));
                    a1.c.b(Double.valueOf((new Length(ValueGoal.a(a1.c), com.fitbit.data.domain.Length.LengthUnits.KM)).a(a1.d).b()));
                }
                double d5 = ValueGoal.a(a1.c);
                double d4 = Math.max(5D, 1.6180000000000001D * d5);
                double d8 = 0.0D;
                obj1 = new ArrayList();
                obj = list.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Distance distance = (Distance)((Iterator) (obj)).next();
                    double d2 = distance.c().doubleValue();
                    if (d2 > 0.0D)
                    {
                        double d = d2;
                        if (a1.d != com.fitbit.data.domain.Length.LengthUnits.KM)
                        {
                            d = (new Length(d2, com.fitbit.data.domain.Length.LengthUnits.KM)).a(a1.d).b();
                        }
                        ((List) (obj1)).add(new j(distance.a().getTime(), new double[] {
                            d
                        }));
                    }
                } while (true);
                com.fitbit.util.chart.a.a(((List) (obj1)));
                obj = obj1;
                if (l() != null)
                {
                    obj = new com.fitbit.ui.l(a.a.getResources().getColor(0x7f0f004b));
                    obj = l().a(((List) (obj1)), new DistanceChartFragment._cls1._cls1._cls1(this, d5, ((Drawable) (obj))));
                }
                double d10 = 0.0D;
                double d7 = 0.0D;
                obj1 = com.fitbit.util.chart.a.a(l().a(), i());
                int i = ((List) (obj)).size() - 1;
                double d1 = d4;
                double d6 = 0.0D;
                d5 = d4;
                while (i >= 0) 
                {
                    j j1 = (j)((List) (obj)).get(i);
                    double d3 = j1.a(0);
                    if (j1.a() >= (double)((Date) (obj1)).getTime())
                    {
                        double d9 = d8;
                        if (d3 < d8)
                        {
                            d9 = d3;
                        }
                        d8 = d1;
                        if (d3 > d1)
                        {
                            d8 = d3;
                        }
                        d7++;
                        d10 += d3;
                        d1 = d8;
                        d8 = d9;
                    }
                    if (d3 < d6)
                    {
                        d6 = d3;
                    }
                    boolean flag;
                    if (d3 <= d5)
                    {
                        d3 = d5;
                    }
                    i--;
                    d5 = d3;
                }
                if (a1.c != null)
                {
                    d1 = d4;
                }
                if (d7 == 0.0D)
                {
                    d3 = 1.0D;
                } else
                {
                    d3 = d7;
                }
                a1.b = d10 / d3;
                a1.a = ((List) (obj));
                a1.e = Math.max(-0.001D, d6);
                a1.f = d5;
                a1.h = d1;
                a1.g = 0.0D;
                if (c == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.i = flag;
                return a1;
            }

                    
                    {
                        a = DistanceChartFragment._cls1.this;
                        super(context, date, date1, filter, intentfilter);
                    }
        }


        // Unreferenced inner class com/fitbit/activity/ui/DistanceChartFragment$1$1$1

/* anonymous class */
        class DistanceChartFragment._cls1._cls1._cls1
            implements com.fitbit.util.chart.Filter.a
        {

            final double a;
            final Drawable b;
            final DistanceChartFragment._cls1._cls1 c;

            public void a(j j1)
            {
                if (a > j1.a(0))
                {
                    j1.a(b);
                }
            }

            public void a(List list)
            {
            }

                    
                    {
                        c = _pcls1;
                        a = d;
                        b = drawable;
                        super();
                    }
        }

    }

}
