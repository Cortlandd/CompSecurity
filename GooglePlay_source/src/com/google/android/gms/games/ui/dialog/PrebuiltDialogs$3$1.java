// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, PrebuiltDialogs, GamesDialogBuilder

final class this._cls0
    implements android.content.ickListener
{

    final eIntent this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = mActivity;
        android.content.Intent intent = UiUtils.createPlayStoreIntent(dialoginterface, "com.google.android.play.games", "GPG_destAppUpgrade");
        try
        {
            dialoginterface.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            GamesLog.e("GamesDialogs", "Unable to launch play store intent", dialoginterface);
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/dialog/PrebuiltDialogs$3

/* anonymous class */
    public static final class PrebuiltDialogs._cls3 extends GamesDialogFragment
    {

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f1002d0).setMessage(0x7f1002cf).setNeutralButton(0x1040000, null).setPositiveButton(0x7f1002ce, new PrebuiltDialogs._cls3._cls1());
        }

    }

}
