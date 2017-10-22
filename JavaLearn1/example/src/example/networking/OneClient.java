package example.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class OneClient {

    public static void main(String[] args) {
        try {
            int iPort = 13;
            Socket sock = new Socket("localhost", iPort);
            BufferedReader din = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String rTime = din.readLine();
            System.out.println(rTime);
            sock.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
