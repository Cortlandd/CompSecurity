// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.ProofOfPayment;

public final class ccm
    implements cct
{

    private ccs a;
    private ccr b;

    public ccm(PayPalService paypalservice)
    {
        a = new ccs(paypalservice);
        b = new ccr(paypalservice);
    }

    public static AlertDialog a(Activity activity, buz buz1, buz buz2, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return (new android.app.AlertDialog.Builder(activity)).setIcon(0x1080027).setTitle(bux.a(buz1)).setMessage(bux.a(buz2)).setPositiveButton(bux.a(buz.at), onclicklistener).setNegativeButton(bux.a(buz.f), null).create();
    }

    private static AlertDialog a(Context context, buz buz1, String s, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        buz1 = bux.a(buz1);
        String s1 = bux.a(buz.at);
        return (new android.app.AlertDialog.Builder(context)).setMessage(s).setCancelable(false).setTitle(buz1).setPositiveButton(s1, onclicklistener).create();
    }

    public static Dialog a(Activity activity, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return (new android.app.AlertDialog.Builder(activity)).setIcon(0x1080027).setCancelable(false).setTitle(bux.a(buz.aR)).setMessage(bux.a(buz.aK)).setPositiveButton(bux.a(buz.aR), onclicklistener).setNegativeButton(bux.a(buz.f), new ccp(activity)).create();
    }

    public static Dialog a(Activity activity, buz buz1, Bundle bundle)
    {
        return a(((Context) (activity)), buz1, bundle.getString("alert_errors"), ((android.content.DialogInterface.OnClickListener) (new ccn())));
    }

    public static Dialog a(Activity activity, buz buz1, Bundle bundle, int i)
    {
        return a(((Context) (activity)), buz1, bundle.getString("alert_errors"), ((android.content.DialogInterface.OnClickListener) (new cco(activity, i))));
    }

    public static Dialog a(Activity activity, buz buz1, Bundle bundle, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return a(((Context) (activity)), buz1, bundle.getString("alert_errors"), onclicklistener);
    }

    public static Dialog a(Context context, buz buz1, buz buz2)
    {
        context = new ProgressDialog(context);
        context.setTitle(bux.a(buz1));
        context.setMessage(bux.a(buz2));
        context.setCancelable(false);
        return context;
    }

    public static Object a(buj buj)
    {
        if (buj instanceof bvy)
        {
            buj = (bvy)buj;
            return new ProofOfPayment(buj.w(), buj.u(), buj.x(), buj.y(), buj.z());
        }
        if (buj instanceof bwc)
        {
            buj = (bwc)buj;
            return new ProofOfPayment(buj.D(), buj.E(), buj.G(), buj.F(), buj.H());
        } else
        {
            throw new RuntimeException("Dev error");
        }
    }

    public static void a(Activity activity, TextView textview, buz buz1)
    {
        android.graphics.Bitmap bitmap;
        if (buz1 != null)
        {
            buz1 = bux.a(buz1);
        } else
        {
            buz1 = "";
        }
        bitmap = bum.d("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpCNDMzRTRFQ0M2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpCNDMzRTRFREM2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkI0MzNFNEVBQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkI0MzNFNEVCQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+Eyd0MQAABoFJREFUeNrMWl1M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", activity);
        bwq.a(activity, textview, buz1, "PayPal - ", new BitmapDrawable(activity.getResources(), bitmap));
    }

    static void a(Activity activity, bzw bzw1)
    {
        boolean flag1 = false;
        boolean flag;
        if (bzw1.a != null && bzw1.a.intValue() >= 500 || bzw1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            activity.showDialog(2);
            return;
        }
        flag = flag1;
        if (bzw1.a())
        {
            flag = flag1;
            if ("invalid_client".equals(bzw1.b))
            {
                flag = true;
            }
        }
        if (flag)
        {
            a(activity, bux.a(buz.bd), 3);
            return;
        } else
        {
            a(activity, bux.a(buz.bb), 1);
            return;
        }
    }

    public static void a(Activity activity, String s, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("alert_errors", s);
        activity.removeDialog(i);
        activity.showDialog(i, bundle);
    }

    public static void a(TextView textview, String s)
    {
label0:
        {
            if (textview != null)
            {
                if (s != null && !bst.c(s))
                {
                    break label0;
                }
                textview.setVisibility(8);
            }
            return;
        }
        if (bst.b(s))
        {
            textview.setText(bux.a(buz.ag));
            return;
        }
        if (bst.a(s))
        {
            textview.setText(bux.a(buz.af));
            return;
        } else
        {
            textview.setText(s);
            return;
        }
    }

    public static boolean a(Activity activity)
    {
        String s = activity.getClass().getName();
        activity = activity.getCallingActivity();
        if (activity == null)
        {
            Log.e("paypal.sdk", (new StringBuilder()).append(s).append(" called by a null activity, not allowed").toString());
            return false;
        }
        activity = activity.getClassName();
        if (!activity.startsWith("com.paypal.android.sdk.payments."))
        {
            Log.e("paypal.sdk", (new StringBuilder()).append(s).append(" called by ").append(activity).append(" which is not part of the SDK, not allowed").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public static Intent b(Activity activity)
    {
        Intent intent = new Intent(activity.getApplicationContext(), com/paypal/android/sdk/payments/PayPalService);
        intent.putExtra("initializingActivity", activity.getClass().getSimpleName());
        if (activity.getIntent().hasExtra("com.paypal.android.sdk.paypalConfiguration"))
        {
            intent.putExtra("com.paypal.android.sdk.paypalConfiguration", activity.getIntent().getParcelableExtra("com.paypal.android.sdk.paypalConfiguration"));
        }
        return intent;
    }

    public final void a(buw buw, boolean flag, String s, String s1, String s2)
    {
        a.a(buw, flag, s, s1, null);
        b.a(buw, flag, s, s1, s2);
    }
}
