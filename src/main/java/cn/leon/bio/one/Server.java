package cn.leon.bio.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 17:17
 * IntelliJ IDEA
 * cn.leon.bio.one
 */
public class Server {

    public static void main(String[] args) {
        try {
            System.out.println("start");
//            创建服务端socket
            ServerSocket serverSocket = new ServerSocket(9999);
//            监听客户端socket
            Socket socket = serverSocket.accept();
//            从socket管道获得输入流
            InputStream inputStream = socket.getInputStream();
//            封装字节输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String msg;
//            读数据
            while ((msg = bufferedReader.readLine()) != null){

                System.out.println("服务端接收消息："+msg);
            }
            inputStream.close();
            bufferedReader.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

    }
}
