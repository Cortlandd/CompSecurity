// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PEMUtil, X509CRLObject

public class X509CRLParser extends X509StreamParserSpi
{

    private static final PEMUtil PEM_PARSER = new PEMUtil("CRL");
    private InputStream currentStream;
    private ASN1Set sData;
    private int sDataObjectCount;

    public X509CRLParser()
    {
        sData = null;
        sDataObjectCount = 0;
        currentStream = null;
    }

    private CRL getCRL()
    {
        if (sData == null || sDataObjectCount >= sData.size())
        {
            return null;
        } else
        {
            ASN1Set asn1set = sData;
            int i = sDataObjectCount;
            sDataObjectCount = i + 1;
            return new X509CRLObject(CertificateList.getInstance(asn1set.getObjectAt(i)));
        }
    }

    private CRL readDERCRL(InputStream inputstream)
    {
        inputstream = (ASN1Sequence)(new ASN1InputStream(inputstream)).readObject();
        if (inputstream.size() > 1 && (inputstream.getObjectAt(0) instanceof DERObjectIdentifier) && inputstream.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData))
        {
            sData = (new SignedData(ASN1Sequence.getInstance((ASN1TaggedObject)inputstream.getObjectAt(1), true))).getCRLs();
            return getCRL();
        } else
        {
            return new X509CRLObject(CertificateList.getInstance(inputstream));
        }
    }

    private CRL readPEMCRL(InputStream inputstream)
    {
        inputstream = PEM_PARSER.readPEMObject(inputstream);
        if (inputstream != null)
        {
            return new X509CRLObject(CertificateList.getInstance(inputstream));
        } else
        {
            return null;
        }
    }

    public void engineInit(InputStream inputstream)
    {
        currentStream = inputstream;
        sData = null;
        sDataObjectCount = 0;
        if (!currentStream.markSupported())
        {
            currentStream = new BufferedInputStream(currentStream);
        }
    }

    public Object engineRead()
    {
        Object obj = null;
        if (sData == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (sDataObjectCount != sData.size())
        {
            return getCRL();
        }
        sData = null;
        sDataObjectCount = 0;
        return null;
        int i;
        try
        {
            currentStream.mark(10);
            i = currentStream.read();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new StreamParsingException(((Exception) (obj)).toString(), ((Throwable) (obj)));
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (i == 48)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        currentStream.reset();
        return readPEMCRL(currentStream);
        currentStream.reset();
        obj = readDERCRL(currentStream);
        return obj;
    }

    public Collection engineReadAll()
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            CRL crl = (CRL)engineRead();
            if (crl != null)
            {
                arraylist.add(crl);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

}
