.class Lcom/localytics/android/SessionHandler$13;
.super Ljava/lang/Object;
.source "SessionHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/SessionHandler;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/SessionHandler;

.field final synthetic val$callback:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/localytics/android/SessionHandler;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 825
    iput-object p1, p0, Lcom/localytics/android/SessionHandler$13;->this$0:Lcom/localytics/android/SessionHandler;

    iput-object p2, p0, Lcom/localytics/android/SessionHandler$13;->val$callback:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 828
    iget-object v0, p0, Lcom/localytics/android/SessionHandler$13;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$13;->val$callback:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->uploadProfile(Ljava/lang/Runnable;)V

    .line 829
    return-void
.end method
