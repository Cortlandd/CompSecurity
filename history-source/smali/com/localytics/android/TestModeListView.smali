.class public Lcom/localytics/android/TestModeListView;
.super Landroid/support/v4/app/DialogFragment;
.source "TestModeListView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/TestModeListView$CancelItemAdapter;,
        Lcom/localytics/android/TestModeListView$MenuItemAdapter;,
        Lcom/localytics/android/TestModeListView$MenuDialog;,
        Lcom/localytics/android/TestModeListView$TestModeDialog;
    }
.end annotation


# static fields
.field public static final TEST_MODE_LIST_TAG:Ljava/lang/String; = "amp_test_mode_list"


# instance fields
.field private mAdapter:Landroid/widget/ListAdapter;

.field private mCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;"
        }
    .end annotation
.end field

.field private mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 66
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/localytics/android/TestModeListView;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    return-void
.end method

.method static synthetic access$200(Lcom/localytics/android/TestModeListView;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/TestModeListView;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/localytics/android/TestModeListView;->mCallbacks:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300(Lcom/localytics/android/TestModeListView;)Landroid/widget/ListAdapter;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/TestModeListView;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/localytics/android/TestModeListView;->mAdapter:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method static synthetic access$400(Lcom/localytics/android/TestModeListView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/TestModeListView;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/localytics/android/TestModeListView;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public static newInstance()Lcom/localytics/android/TestModeListView;
    .locals 2

    .prologue
    .line 206
    new-instance v0, Lcom/localytics/android/TestModeListView;

    invoke-direct {v0}, Lcom/localytics/android/TestModeListView;-><init>()V

    .line 207
    .local v0, "fragment":Lcom/localytics/android/TestModeListView;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/localytics/android/TestModeListView;->setRetainInstance(Z)V

    .line 208
    return-object v0
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 73
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 75
    const-string v0, "TestModeListView"

    const-string v1, "onActivityCreated"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 78
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 83
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "TestModeListView"

    const-string v1, "onAttach"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 88
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 93
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "TestModeListView"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 98
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 214
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 216
    const-string v0, "TestModeListView"

    const-string v1, "onCreateDialog"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    :cond_0
    new-instance v0, Lcom/localytics/android/TestModeListView$TestModeDialog;

    invoke-virtual {p0}, Lcom/localytics/android/TestModeListView;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x103000b

    invoke-direct {v0, p0, v1, v2}, Lcom/localytics/android/TestModeListView$TestModeDialog;-><init>(Lcom/localytics/android/TestModeListView;Landroid/content/Context;I)V

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 194
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "TestModeListView"

    const-string v1, "onCreateView"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/DialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 153
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 155
    const-string v0, "TestModeListView"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 158
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 224
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 226
    const-string v0, "TestModeListView"

    const-string v1, "onDestroyView"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    :cond_0
    invoke-virtual {p0}, Lcom/localytics/android/TestModeListView;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/localytics/android/TestModeListView;->getRetainInstance()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    invoke-virtual {p0}, Lcom/localytics/android/TestModeListView;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 232
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroyView()V

    .line 233
    return-void
.end method

.method public onDetach()V
    .locals 2

    .prologue
    .line 103
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 105
    const-string v0, "TestModeListView"

    const-string v1, "onDetach"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDetach()V

    .line 108
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 113
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 115
    const-string v0, "TestModeListView"

    const-string v1, "onDismiss"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 118
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 133
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 135
    const-string v0, "TestModeListView"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onPause()V

    .line 138
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 143
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 145
    const-string v0, "TestModeListView"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 148
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 183
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 185
    const-string v0, "TestModeListView"

    const-string v1, "onSaveInstanceState"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 188
    return-void
.end method

.method public onStart()V
    .locals 2

    .prologue
    .line 123
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 125
    const-string v0, "TestModeListView"

    const-string v1, "onStart"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    .line 128
    return-void
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 163
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "TestModeListView"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStop()V

    .line 168
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 173
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 175
    const-string v0, "TestModeListView"

    const-string v1, "onViewStateRestored"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 178
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 0
    .param p1, "adapter"    # Landroid/widget/ListAdapter;

    .prologue
    .line 244
    iput-object p1, p0, Lcom/localytics/android/TestModeListView;->mAdapter:Landroid/widget/ListAdapter;

    .line 245
    return-void
.end method

.method public setCallbacks(Ljava/util/Map;)Lcom/localytics/android/TestModeListView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;)",
            "Lcom/localytics/android/TestModeListView;"
        }
    .end annotation

    .prologue
    .line 249
    .local p1, "callbacks":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Lcom/localytics/android/AmpCallable;>;"
    iput-object p1, p0, Lcom/localytics/android/TestModeListView;->mCallbacks:Ljava/util/Map;

    .line 250
    return-object p0
.end method

.method public show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
    .locals 2
    .param p1, "manager"    # Landroid/support/v4/app/FragmentManager;
    .param p2, "tag"    # Ljava/lang/String;

    .prologue
    .line 238
    iget-object v0, p0, Lcom/localytics/android/TestModeListView;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 239
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 240
    return-void
.end method
