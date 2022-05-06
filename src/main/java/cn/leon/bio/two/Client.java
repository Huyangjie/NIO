package cn.leon.bio.two;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Leon
 * @create 2022-05-06 17:56
 * IntelliJ IDEA
 * cn.leon.bio.two
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        OutputStream outputStream = socket.getOutputStream();

//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        PrintStream printStream = new PrintStream(outputStream);

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请说:");
            String msg = scanner.nextLine();
            printStream.println(msg);
            printStream.flush();
        }





    }
}
