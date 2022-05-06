package cn.leon.bio.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Leon
 * @create 2022-05-06 17:57
 * IntelliJ IDEA
 * cn.leon.bio.two
 */
public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {


        try {

            System.out.println("start:"+socket.getPort());

            InputStream inputStream = socket.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String msg;
            while ((msg = bufferedReader.readLine())!= null){

                System.out.println(socket+"msg:"+msg);
            }

//            inputStream.close();
//            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
