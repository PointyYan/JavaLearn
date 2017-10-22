package example.networking.Beta1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//import java.net.UnknownHostException;

public class Client {

    public Socket socket;
    public BufferedReader bufferedReader1;
    public BufferedReader bufferedReader2;
    public PrintWriter out;

    public Client() {
        try {
            socket = new Socket("localhost", 1997);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {


            try{
                bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(socket.getOutputStream(), true);
                String str;
                while ((str = bufferedReader1.readLine()) != null) {
                    out.println(str);
                }
                bufferedReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                out.close();
            }
        }).start();

        new Thread(() -> {
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = null;
                while ((str = bufferedReader2.readLine()) != null) {
                    System.out.println("receive from server:" + str);
                }
                bufferedReader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }

    public static void main(String[] args) {
        new Client();
    }

}
