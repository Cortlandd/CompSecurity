.class final Lcom/crashlytics/android/S;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private synthetic a:Lcom/crashlytics/android/E;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/E;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/crashlytics/android/S;->a:Lcom/crashlytics/android/E;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 278
    iget-object v0, p0, Lcom/crashlytics/android/S;->a:Lcom/crashlytics/android/E;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/crashlytics/android/E;->a(Lcom/crashlytics/android/E;Z)Z

    .line 279
    return-void
.end method
