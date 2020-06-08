package lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        final int PORT = 8189;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен!");

            //socket = server.accept();
            System.out.println("Клиент подключился ");

            Scanner in = new Scanner(socket.getInputStream());

            new Thread(() -> {
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    while (true) {
                        String str = in.nextLine();

                        if (str.equals("/end")) {
                            System.out.println("Клиент отключился");
                            break;
                        }

                        System.out.println("Клиент: " + str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
            ).start();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

