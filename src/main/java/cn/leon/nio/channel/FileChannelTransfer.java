package cn.leon.nio.channel;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Leon
 * @create 2022-05-05 22:23
 * IntelliJ IDEA
 * cn.leon.channel
 */
public class FileChannelTransfer {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("E:\\FileChannel\\text1.txt","rw");

        FileChannel fileChannel1 = randomAccessFile1.getChannel();

        RandomAccessFile randomAccessFile2 = new RandomAccessFile("E:\\FileChannel\\text2.txt","rw");

        FileChannel fileChannel2 = randomAccessFile2.getChannel();

        fileChannel2.transferFrom(fileChannel1,0,fileChannel1.size());

        fileChannel1.close();
        fileChannel2.close();
        System.out.println("over");


    }
}
