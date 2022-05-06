package cn.leon.bio.three;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 20:42
 * IntelliJ IDEA
 * cn.leon.bio.three
 */
public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            ServerThreadPoll serverThreadPoll = new ServerThreadPoll(3, 10);

            while (true){

                Socket socket = serverSocket.accept();

                ServerRunnableTarget serverRunnableTarget = new ServerRunnableTarget(socket);

                serverThreadPoll.execute(serverRunnableTarget);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
