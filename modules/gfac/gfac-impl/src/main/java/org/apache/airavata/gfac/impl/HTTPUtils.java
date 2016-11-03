package org.apache.airavata.gfac.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * HTTP utility class to handle file transfer using HTTP.
 */
public class HTTPUtils {

    private static final Logger log = LoggerFactory.getLogger(HTTPUtils.class);

    static {
        // Create a new trust manager that trust all certificates
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        // Activate the new trust manager
        SSLContext sc = null;
        try {
            sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new ExceptionInInitializerError(e);
        }

        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

    public static String httpTo(String localFile, String remoteFile) throws IOException {

        FileInputStream fis = null;
        OutputStream out = null;

        try {

            URL u = new URL(remoteFile);

            URLConnection uc = u.openConnection();

            uc.setDoOutput(true);
            uc.setDoInput(true);

            uc.setAllowUserInteraction(false);

            out = uc.getOutputStream();

            // send a content of localFile
            fis = new FileInputStream(localFile);

            byte[] buffer = new byte[1024];
            int len;

            while ((len = fis.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }

        } finally {
            if (null != fis) {
                fis.close();
            }
            if (null != out) {
                out.close();
            }
        }
        //since remote file is always a file  we just return the file
        return remoteFile;
    }

    /**
     * @param remoteFile
     * @param localFile
     * @throws IOException
     */
    public static void httpFrom(String remoteFile, String localFile) throws IOException {

        FileOutputStream fos = null;
        InputStream in = null;
        try {
            String prefix = null;
            if (new File(localFile).isDirectory()) {
                prefix = localFile + File.separator;
            }

            URL u = new URL(remoteFile);

            URLConnection uc = u.openConnection();

            uc.setDoOutput(true);
            uc.setDoInput(true);

            uc.setAllowUserInteraction(false);

            in = uc.getInputStream();

            String file = remoteFile.substring(remoteFile.lastIndexOf("/"));

            fos = new FileOutputStream(prefix == null ? localFile : prefix + file);

            byte[] buffer = new byte[1024];
            int len;

            while ((len = in.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

        } finally {

            if (fos != null) {
                fos.close();
            }
            if (in != null) {
                in.close();
            }

        }
    }

}
