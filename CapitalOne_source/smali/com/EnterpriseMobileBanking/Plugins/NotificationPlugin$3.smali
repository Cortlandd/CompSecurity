.class final Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$3;
.super Ljava/lang/Object;
.source "NotificationPlugin.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 225
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 226
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->access$000()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 227
    return-void
.end method
