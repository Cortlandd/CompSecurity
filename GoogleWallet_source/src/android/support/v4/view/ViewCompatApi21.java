// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            OnApplyWindowInsetsListener, WindowInsetsCompatApi21

final class ViewCompatApi21
{

    public static void requestApplyInsets(View view)
    {
        view.requestApplyInsets();
    }

    public static void setElevation(View view, float f)
    {
        view.setElevation(f);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(onapplywindowinsetslistener) {

            final OnApplyWindowInsetsListener val$listener;

            public final WindowInsets onApplyWindowInsets(View view1, WindowInsets windowinsets)
            {
                windowinsets = new WindowInsetsCompatApi21(windowinsets);
                return ((WindowInsetsCompatApi21)listener.onApplyWindowInsets(view1, windowinsets)).unwrap();
            }

            
            {
                listener = onapplywindowinsetslistener;
                super();
            }
        });
    }
}
