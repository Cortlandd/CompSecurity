// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            LoaderManager, FragmentActivity, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{
    final class LoaderInfo
        implements android.support.v4.content.Loader.OnLoadCompleteListener
    {

        final Bundle mArgs;
        LoaderManager.LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        final LoaderManagerImpl this$0;

        void callOnLoadFinished(Loader loader, Object obj)
        {
            String s;
            if (mCallbacks == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            s = null;
            if (mActivity != null)
            {
                s = mActivity.mFragments.mNoTransactionsBecause;
                mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  onLoadFinished in ")).append(loader).append(": ").append(loader.dataToString(obj)).toString());
            }
            mCallbacks.onLoadFinished(loader, obj);
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            mDeliveredData = true;
            return;
            loader;
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            throw loader;
        }

        void destroy()
        {
            String s;
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(this).toString());
            }
            mDestroyed = true;
            boolean flag = mDeliveredData;
            mDeliveredData = false;
            if (mCallbacks == null || mLoader == null || !mHaveData || !flag)
            {
                break MISSING_BLOCK_LABEL_174;
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(this).toString());
            }
            s = null;
            if (mActivity != null)
            {
                s = mActivity.mFragments.mNoTransactionsBecause;
                mActivity.mFragments.mNoTransactionsBecause = "onLoaderReset";
            }
            mCallbacks.onLoaderReset(mLoader);
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            mCallbacks = null;
            mData = null;
            mHaveData = false;
            if (mLoader != null)
            {
                if (mListenerRegistered)
                {
                    mListenerRegistered = false;
                    mLoader.unregisterListener(this);
                }
                mLoader.reset();
            }
            if (mPendingLoader != null)
            {
                mPendingLoader.destroy();
            }
            return;
            Exception exception;
            exception;
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            throw exception;
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.print(s);
            printwriter.print("mId=");
            printwriter.print(mId);
            printwriter.print(" mArgs=");
            printwriter.println(mArgs);
            printwriter.print(s);
            printwriter.print("mCallbacks=");
            printwriter.println(mCallbacks);
            printwriter.print(s);
            printwriter.print("mLoader=");
            printwriter.println(mLoader);
            if (mLoader != null)
            {
                mLoader.dump((new StringBuilder(String.valueOf(s))).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (mHaveData || mDeliveredData)
            {
                printwriter.print(s);
                printwriter.print("mHaveData=");
                printwriter.print(mHaveData);
                printwriter.print("  mDeliveredData=");
                printwriter.println(mDeliveredData);
                printwriter.print(s);
                printwriter.print("mData=");
                printwriter.println(mData);
            }
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(mStarted);
            printwriter.print(" mReportNextStart=");
            printwriter.print(mReportNextStart);
            printwriter.print(" mDestroyed=");
            printwriter.println(mDestroyed);
            printwriter.print(s);
            printwriter.print("mRetaining=");
            printwriter.print(mRetaining);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(mRetainingStarted);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(mListenerRegistered);
            if (mPendingLoader != null)
            {
                printwriter.print(s);
                printwriter.println("Pending Loader ");
                printwriter.print(mPendingLoader);
                printwriter.println(":");
                mPendingLoader.dump((new StringBuilder(String.valueOf(s))).append("  ").toString(), filedescriptor, printwriter, as);
            }
        }

        void finishRetain()
        {
            if (mRetaining)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Finished Retaining: ")).append(this).toString());
                }
                mRetaining = false;
                if (mStarted != mRetainingStarted && !mStarted)
                {
                    stop();
                }
            }
            if (mStarted && mHaveData && !mReportNextStart)
            {
                callOnLoadFinished(mLoader, mData);
            }
        }

        public void onLoadComplete(Loader loader, Object obj)
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("onLoadComplete: ")).append(this).toString());
            }
            if (!mDestroyed) goto _L2; else goto _L1
_L1:
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
            }
_L4:
            return;
_L2:
            if (mLoaders.get(mId) == this)
            {
                break; /* Loop/switch isn't completed */
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            LoaderInfo loaderinfo = mPendingLoader;
            if (loaderinfo != null)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Switching to pending loader: ")).append(loaderinfo).toString());
                }
                mPendingLoader = null;
                mLoaders.put(mId, null);
                destroy();
                installLoader(loaderinfo);
                return;
            }
            if (mData != obj || !mHaveData)
            {
                mData = obj;
                mHaveData = true;
                if (mStarted)
                {
                    callOnLoadFinished(loader, obj);
                }
            }
            loader = (LoaderInfo)mInactiveLoaders.get(mId);
            if (loader != null && loader != this)
            {
                loader.mDeliveredData = false;
                loader.destroy();
                mInactiveLoaders.remove(mId);
            }
            if (mActivity != null && !hasRunningLoaders())
            {
                mActivity.mFragments.startPendingDeferredFragments();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        void reportStart()
        {
            if (mStarted && mReportNextStart)
            {
                mReportNextStart = false;
                if (mHaveData)
                {
                    callOnLoadFinished(mLoader, mData);
                }
            }
        }

        void retain()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(this).toString());
            }
            mRetaining = true;
            mRetainingStarted = mStarted;
            mStarted = false;
            mCallbacks = null;
        }

        void start()
        {
            if (mRetaining && mRetainingStarted)
            {
                mStarted = true;
            } else
            if (!mStarted)
            {
                mStarted = true;
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Starting: ")).append(this).toString());
                }
                if (mLoader == null && mCallbacks != null)
                {
                    mLoader = mCallbacks.onCreateLoader(mId, mArgs);
                }
                if (mLoader != null)
                {
                    if (mLoader.getClass().isMemberClass() && !Modifier.isStatic(mLoader.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(mLoader).toString());
                    }
                    if (!mListenerRegistered)
                    {
                        mLoader.registerListener(mId, this);
                        mListenerRegistered = true;
                    }
                    mLoader.startLoading();
                    return;
                }
            }
        }

        void stop()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
            }
            mStarted = false;
            if (!mRetaining && mLoader != null && mListenerRegistered)
            {
                mListenerRegistered = false;
                mLoader.unregisterListener(this);
                mLoader.stopLoading();
            }
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append("LoaderInfo{");
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(" #");
            stringbuilder.append(mId);
            stringbuilder.append(" : ");
            DebugUtils.buildShortClassTag(mLoader, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }

        public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
        {
            this$0 = LoaderManagerImpl.this;
            super();
            mId = i;
            mArgs = bundle;
            mCallbacks = loadercallbacks;
        }
    }


    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders = new SparseArrayCompat();
    final SparseArrayCompat mLoaders = new SparseArrayCompat();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    LoaderManagerImpl(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        mWho = s;
        mActivity = fragmentactivity;
        mStarted = flag;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        mCreatingLoader = true;
        bundle = createLoader(i, bundle, loadercallbacks);
        installLoader(bundle);
        mCreatingLoader = false;
        return bundle;
        bundle;
        mCreatingLoader = false;
        throw bundle;
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        LoaderInfo loaderinfo = new LoaderInfo(i, bundle, loadercallbacks);
        loaderinfo.mLoader = loadercallbacks.onCreateLoader(i, bundle);
        return loaderinfo;
    }

    public void destroyLoader(int i)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i).toString());
        }
        int j = mLoaders.indexOfKey(i);
        if (j >= 0)
        {
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(j);
            mLoaders.removeAt(j);
            loaderinfo.destroy();
        }
        i = mInactiveLoaders.indexOfKey(i);
        if (i >= 0)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(i);
            mInactiveLoaders.removeAt(i);
            loaderinfo1.destroy();
        }
        if (mActivity != null && !hasRunningLoaders())
        {
            mActivity.mFragments.startPendingDeferredFragments();
        }
    }

    void doDestroy()
    {
        if (mRetaining) goto _L2; else goto _L1
_L1:
        int i;
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Active in ")).append(this).toString());
        }
        i = mLoaders.size() - 1;
_L5:
        if (i >= 0) goto _L4; else goto _L3
_L3:
        mLoaders.clear();
_L2:
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        i = mInactiveLoaders.size() - 1;
_L6:
        if (i < 0)
        {
            mInactiveLoaders.clear();
            return;
        }
        break MISSING_BLOCK_LABEL_127;
_L4:
        ((LoaderInfo)mLoaders.valueAt(i)).destroy();
        i--;
          goto _L5
        ((LoaderInfo)mInactiveLoaders.valueAt(i)).destroy();
        i--;
          goto _L6
    }

    void doReportNextStart()
    {
        int i = mLoaders.size() - 1;
        do
        {
            if (i < 0)
            {
                return;
            }
            ((LoaderInfo)mLoaders.valueAt(i)).mReportNextStart = true;
            i--;
        } while (true);
    }

    void doReportStart()
    {
        int i = mLoaders.size() - 1;
        do
        {
            if (i < 0)
            {
                return;
            }
            ((LoaderInfo)mLoaders.valueAt(i)).reportStart();
            i--;
        } while (true);
    }

    void doRetain()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Retaining in ")).append(this).toString());
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            mRetaining = true;
            mStarted = false;
            int i = mLoaders.size() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.valueAt(i)).retain();
                i--;
            }
        }
    }

    void doStart()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Starting in ")).append(this).toString());
        }
        if (mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            mStarted = true;
            int i = mLoaders.size() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.valueAt(i)).start();
                i--;
            }
        }
    }

    void doStop()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Stopping in ")).append(this).toString());
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        int i = mLoaders.size() - 1;
        do
        {
            if (i < 0)
            {
                mStarted = false;
                return;
            }
            ((LoaderInfo)mLoaders.valueAt(i)).stop();
            i--;
        } while (true);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        if (mLoaders.size() <= 0) goto _L2; else goto _L1
_L1:
        String s1;
        int i;
        printwriter.print(s);
        printwriter.println("Active Loaders:");
        s1 = (new StringBuilder(String.valueOf(s))).append("    ").toString();
        i = 0;
_L6:
        if (i < mLoaders.size()) goto _L3; else goto _L2
_L2:
        if (mInactiveLoaders.size() <= 0) goto _L5; else goto _L4
_L4:
        printwriter.print(s);
        printwriter.println("Inactive Loaders:");
        s1 = (new StringBuilder(String.valueOf(s))).append("    ").toString();
        i = 0;
_L7:
        if (i < mInactiveLoaders.size())
        {
            break MISSING_BLOCK_LABEL_188;
        }
_L5:
        return;
_L3:
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(mLoaders.keyAt(i));
        printwriter.print(": ");
        printwriter.println(loaderinfo.toString());
        loaderinfo.dump(s1, filedescriptor, printwriter, as);
        i++;
          goto _L6
        LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(i);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(mInactiveLoaders.keyAt(i));
        printwriter.print(": ");
        printwriter.println(loaderinfo1.toString());
        loaderinfo1.dump(s1, filedescriptor, printwriter, as);
        i++;
          goto _L7
    }

    void finishRetain()
    {
        if (!mRetaining) goto _L2; else goto _L1
_L1:
        int i;
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("Finished Retaining in ")).append(this).toString());
        }
        mRetaining = false;
        i = mLoaders.size() - 1;
_L5:
        if (i >= 0) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((LoaderInfo)mLoaders.valueAt(i)).finishRetain();
        i--;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Loader getLoader(int i)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (loaderinfo != null)
        {
            if (loaderinfo.mPendingLoader != null)
            {
                return loaderinfo.mPendingLoader.mLoader;
            } else
            {
                return loaderinfo.mLoader;
            }
        } else
        {
            return null;
        }
    }

    public boolean hasRunningLoaders()
    {
        boolean flag1 = false;
        int j = mLoaders.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return flag1;
            }
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
            boolean flag;
            if (loaderinfo.mStarted && !loaderinfo.mDeliveredData)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            i++;
        } while (true);
    }

    public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("initLoader in ")).append(this).append(": args=").append(bundle).toString());
        }
        if (loaderinfo == null)
        {
            loadercallbacks = createAndInstallLoader(i, bundle, loadercallbacks);
            bundle = loadercallbacks;
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Created new loader ")).append(loadercallbacks).toString());
                bundle = loadercallbacks;
            }
        } else
        {
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder("  Re-using existing loader ")).append(loaderinfo).toString());
            }
            loaderinfo.mCallbacks = loadercallbacks;
            bundle = loaderinfo;
        }
        if (((LoaderInfo) (bundle)).mHaveData && mStarted)
        {
            bundle.callOnLoadFinished(((LoaderInfo) (bundle)).mLoader, ((LoaderInfo) (bundle)).mData);
        }
        return ((LoaderInfo) (bundle)).mLoader;
    }

    void installLoader(LoaderInfo loaderinfo)
    {
        mLoaders.put(loaderinfo.mId, loaderinfo);
        if (mStarted)
        {
            loaderinfo.start();
        }
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(bundle).toString());
        }
        if (loaderinfo != null)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.get(i);
            if (loaderinfo1 != null)
            {
                if (loaderinfo.mHaveData)
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Removing last inactive loader: ")).append(loaderinfo).toString());
                    }
                    loaderinfo1.mDeliveredData = false;
                    loaderinfo1.destroy();
                    loaderinfo.mLoader.abandon();
                    mInactiveLoaders.put(i, loaderinfo);
                } else
                if (!loaderinfo.mStarted)
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    mLoaders.put(i, null);
                    loaderinfo.destroy();
                } else
                {
                    if (loaderinfo.mPendingLoader != null)
                    {
                        if (DEBUG)
                        {
                            Log.v("LoaderManager", (new StringBuilder("  Removing pending loader: ")).append(loaderinfo.mPendingLoader).toString());
                        }
                        loaderinfo.mPendingLoader.destroy();
                        loaderinfo.mPendingLoader = null;
                    }
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                    }
                    loaderinfo.mPendingLoader = createLoader(i, bundle, loadercallbacks);
                    return loaderinfo.mPendingLoader.mLoader;
                }
            } else
            {
                if (DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Making last loader inactive: ")).append(loaderinfo).toString());
                }
                loaderinfo.mLoader.abandon();
                mInactiveLoaders.put(i, loaderinfo);
            }
        }
        return createAndInstallLoader(i, bundle, loadercallbacks).mLoader;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    void updateActivity(FragmentActivity fragmentactivity)
    {
        mActivity = fragmentactivity;
    }

    static 
    {
        DEBUG = false;
    }
}
