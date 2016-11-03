package org.apache.airavata.gfac.impl;

import com.jcraft.jsch.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * SFTP utility class to handle file transfer using SFTP
 */
public class SFTPUtils {

    private static final Logger log = LoggerFactory.getLogger(SFTPUtils.class);

    /**
     * Copy local file to remote system
     *
     * @param localFile local file to transfer
     * @param remoteFile remote file location
     * @param session JSCH Session for target
     * @return destination file location
     * @throws IOException
     * @throws JSchException
     * @throws SftpException
     */
    public static String sftpTo(String localFile, String remoteFile, Session session)
            throws IOException, JSchException, SftpException {

        Channel channel = null;

        try {

            //open SFTP channel
            channel = session.openChannel("sftp");
            channel.connect();

            ChannelSftp channelSftp = (ChannelSftp) channel;

            //Copy file to remote location
            channelSftp.put(localFile, remoteFile);

        }finally {

            //close SFTP channel
            if (null != channel) {
                channel.disconnect();
            }
        }

        return remoteFile;
    }

    /**
     *
     * @param remoteFile remote file location
     * @param localFile local file to transfer
     * @param session JSCH Session for source
     * @return destination file location
     * @throws IOException
     * @throws JSchException
     * @throws SftpException
     */
    public static String sftpFrom(String remoteFile, String localFile, Session session)
            throws IOException, JSchException, SftpException {

        Channel channel = null;
        try {

            channel = session.openChannel("sftp");
            channel.connect();

            ChannelSftp channelSftp = (ChannelSftp) channel;

            channelSftp.get(remoteFile, localFile);

        } finally {

            //close SFTP channel
            if (null != channel) {
                channel.disconnect();
            }
        }

        return remoteFile;
    }

    /**
     *
     * @param sourceFile source file location
     * @param srcSession JSCH session for source
     * @param destFile destination file location
     * @param destSession JSCH session for target
     * @return destination file location
     * @throws IOException
     * @throws JSchException
     * @throws SftpException
     */
    public static String sftpThirdParty(String sourceFile, Session srcSession, String destFile, Session destSession, boolean ignoreEmptyFile) throws IOException, JSchException, SftpException{
        Channel srcChannel = null;
        Channel destChannel = null;
        InputStream in = null;
        OutputStream out = null;
        try {

            //open Source SFTP channel
            srcChannel = srcSession.openChannel("sftp");

            //open Dest SFTP channel
            destChannel = destSession.openChannel("sftp");

            ChannelSftp channelSrcSftp = (ChannelSftp) srcChannel;
            ChannelSftp channelDestSftp = (ChannelSftp) destChannel;

            srcChannel.connect();
            destChannel.connect();

            in = channelSrcSftp.get(sourceFile);
            out = channelDestSftp.put(destFile);

            byte[] buffer = new byte[1024];
            int len;

            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }

        } finally {

            //close Source SFTP channel
            if (null != srcChannel)srcChannel.disconnect();

            //close Dest SFTP channel
            if (null != destSession)destSession.disconnect();

            //close source input stream
            if (null != in)in.close();

            //close dest output stream
            if (null != out)out.close();

        }
        return destFile;
    }

    /**
     * Create directory on remote system
     *
     * @param remoteDir location of the directory
     * @param session JSCH session for remote
     * @return
     * @throws IOException
     * @throws JSchException
     * @throws SftpException
     */
    public static String makeDirectory(String remoteDir, Session session)
            throws IOException, JSchException, SftpException {

        Channel channel = null;

        try {

            //open SFTP channel
            channel = session.openChannel("sftp");
            channel.connect();

            ChannelSftp channelSftp = (ChannelSftp) channel;

            //make directory
            channelSftp.mkdir(remoteDir);

        }finally {

            if (null != channel) {
                channel.disconnect();
            }
        }

        return remoteDir;
    }

    /**
     * List files under remote directory
     *
     * @param remoteDir location of the remote directory
     * @param session JSCH session for remote
     * @return
     * @throws IOException
     * @throws JSchException
     * @throws SftpException
     */
    public static ArrayList<String> sftpListDirectory(String remoteDir, Session session)
            throws IOException, JSchException, SftpException {

        Channel channel = null;
        ArrayList<String> fileList = null;
        try {

            //open SFTP channel
            channel = session.openChannel("sftp");
            channel.connect();

            ChannelSftp channelSftp = (ChannelSftp) channel;

            //list files under remote directory
            Vector files = channelSftp.ls(remoteDir);

            //create list of string out of vector of objects
            fileList = new ArrayList<>(files.size());
            for (Object fileLoc : files) {
                fileList.add(fileLoc.toString());
            }

        }finally {

            if (null != channel) {
                channel.disconnect();
            }
        }

        return fileList;
    }

}
