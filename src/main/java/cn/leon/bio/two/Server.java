package cn.leon.bio.two;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 17:56
 * IntelliJ IDEA
 * cn.leon.bio.two
 */
public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            while (true){

                Socket socket = serverSocket.accept();

                ServerThread serverThread = new ServerThread(socket);

                serverThread.start();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
