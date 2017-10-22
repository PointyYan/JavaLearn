package example.networking.Beta1;
/**
 * Description: Server
 *
 *
 * Author: ${Vapor}
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    private Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(8788);
            System.out.println("Server is connecting...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connection is done.");
                new ChatThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ChatThread extends Thread {

        Socket socketT;
        BufferedReader bufferedReader;
        PrintWriter printWriter;

        private ChatThread(Socket socket) {
            this.socketT = socket;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                printWriter = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        @Override
        public void run() {
            super.run();
            String msg;
            try {
                while ((msg = bufferedReader.readLine()) != null) {
                    System.out.println("Client send msg: " + msg);
                    String msg2 = "Server reply : " + msg;
                    printWriter.write(msg2);
                    System.out.println("Server reply msg : " + msg2);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Server();
    }


}
