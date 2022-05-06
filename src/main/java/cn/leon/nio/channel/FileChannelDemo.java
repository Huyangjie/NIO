package cn.leon.nio.channel;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Leon
 * @create 2022-05-05 18:46
 * IntelliJ IDEA
 * cn.leon.channel
 */
public class FileChannelDemo {
    public static void main(String[] args) throws Exception {

//        创建channel
        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\FileChannel\\text1.txt","rw");
        FileChannel channel = randomAccessFile.getChannel();

//        创建buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

//        读取数据到buffer中
        int read = channel.read(buffer);

//        -1表示读到最后一行
        while (read!=-1){
            System.out.println("读取了"+read);

            buffer.flip();

//           hasRemaining 看buffer里是否有剩余内容
            while (buffer.hasRemaining()){
                System.out.println(buffer.getChar());
            }
            buffer.clear();

            read = channel.read(buffer);

        }
        randomAccessFile.close();
        System.out.println("over!!!!");


    }
}
