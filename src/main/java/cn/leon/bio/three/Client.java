package cn.leon.bio.three;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Leon
 * @create 2022-05-06 20:42
 * IntelliJ IDEA
 * cn.leon.bio.three
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        OutputStream outputStream = socket.getOutputStream();

        PrintStream printStream = new PrintStream(outputStream);

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("say:");

            String msg = scanner.nextLine();

            printStream.println(msg);

            printStream.flush();

        }

    }
}
