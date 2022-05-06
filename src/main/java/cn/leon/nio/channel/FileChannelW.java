package cn.leon.nio.channel;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Leon
 * @create 2022-05-05 22:23
 * IntelliJ IDEA
 * cn.leon.channel
 */
public class FileChannelW {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\FileChannel\\text1.txt","rw");

        FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        String fileData = "hello world好狗蛋";

        byteBuffer.clear();

        byteBuffer.put(fileData.getBytes());

        byteBuffer.flip();

        while (byteBuffer.hasRemaining()){

            fileChannel.write(byteBuffer);

        }

        fileChannel.close();

        byteBuffer.clear();

    }
}
