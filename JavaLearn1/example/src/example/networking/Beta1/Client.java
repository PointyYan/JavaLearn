package example.networking.Beta1;

/**
 * Description: Client
 *
 *
 * Author: ${Vapor}
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public Socket socket;
    private BufferedReader bufferedReader1;
    public PrintWriter out;

    private Client() {
        try {
            socket = new Socket("localhost", 8788);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String str = null;
            serverReply(dataInputStream);
            while ((str = scanner.nextLine()) != null) {
                dataOutputStream.writeUTF(str);
                System.out.println("Client send msg : " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void serverReply(final DataInputStream dataInputStream) {

        new Thread() {
            @Override
            public void run() {
                super.run();
                String readLine = null;
                try {
                    while ((readLine = dataInputStream.readUTF()) != null) {
                        System.out.println("Client receive msg from server : " + readLine);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void main(String[] args) {
        new Client();
    }

}
