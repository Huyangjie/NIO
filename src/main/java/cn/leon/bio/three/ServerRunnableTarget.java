package cn.leon.bio.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 20:58
 * IntelliJ IDEA
 * cn.leon.bio.three
 */
public class ServerRunnableTarget implements Runnable {

    private Socket socket;

    public ServerRunnableTarget(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine())!=null){
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
