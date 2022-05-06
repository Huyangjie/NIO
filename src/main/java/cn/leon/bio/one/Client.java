package cn.leon.bio.one;

import java.io.*;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 17:17
 * IntelliJ IDEA
 * cn.leon.bio.one
 */
public class Client {

    public static void main(String[] args) throws IOException {
//        创建socket对象连接服务端
        Socket socket = new Socket("127.0.0.1", 9999);
//        创建输入流
        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        System.out.println("start");

        PrintStream printStream = new PrintStream(outputStream);

        printStream.println("hello world");

        printStream.flush();

        //bufferedWriter.write("hello");

//        bufferedWriter.flush();
//
//        bufferedWriter.close();
    }
}
