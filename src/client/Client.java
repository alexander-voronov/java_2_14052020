package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        final String IP_ADDRESS = "localhost";
        final int PORT = 8189;

            try {
                socket = new Socket(IP_ADDRESS, PORT);
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());

                new Thread(() -> {
                    try {
                        while (true) {
                            String str = in.readUTF();

                            if (str.equals("/end")) {
                                break;
                            }

                            //textArea.appendText(str + "\n");
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
                }).start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        public void sendMsg() {
            try {
                out.writeUTF( msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
