// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package okio:
//            AsyncTimeout, Okio

static final class meout extends AsyncTimeout
{

    final Socket val$socket;

    protected IOException newTimeoutException(IOException ioexception)
    {
        SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
        if (ioexception != null)
        {
            sockettimeoutexception.initCause(ioexception);
        }
        return sockettimeoutexception;
    }

    protected void timedOut()
    {
        try
        {
            val$socket.close();
            return;
        }
        catch (Exception exception)
        {
            Okio.access$000().log(Level.WARNING, (new StringBuilder()).append("Failed to close timed out socket ").append(val$socket).toString(), exception);
        }
    }

    ket(Socket socket1)
    {
        val$socket = socket1;
        super();
    }
}
