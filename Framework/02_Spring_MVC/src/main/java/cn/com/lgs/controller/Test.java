package cn.com.lgs.controller;

import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.util.encoders.Base64;

import java.io.UnsupportedEncodingException;
import java.security.Security;

/**
 * @Author luGuoSong
 * @Date 2020/9/3 17:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Security.addProvider(new BouncyCastleProvider());
        SM3Digest digest=new SM3Digest();
        byte[] srcData="12345678".getBytes("UTF-8");
        digest.update(srcData,0,srcData.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash,0);
        System.out.println(ByteUtils.toHexString(hash));
        byte[] encode = Base64.encode(hash);
        System.out.println(new String(encode));
    }
}
