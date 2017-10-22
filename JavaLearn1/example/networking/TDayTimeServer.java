package example.networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TDayTimeServer {
    public static void main(String[] args) {
        try {
            ServerSocket listen = new ServerSocket(13);
            System.out.println("Listening on : " + listen.getLocalPort());
            while (true){
                Socket cInt = listen.accept();
                System.out.println(cInt.toString());
                ConnectionT connectionT = new ConnectionT(cInt);
            }
        } catch (IOException e) {
            System.out.println("server terminated");
        }
    }
}
