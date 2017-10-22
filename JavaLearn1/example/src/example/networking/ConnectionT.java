package example.networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionT extends Thread {
    protected Socket cInt;

    public ConnectionT(Socket socket) {

        cInt = socket;
        this.start();

    }

    public void run() {
        String s = "Hello";
        try {
            PrintWriter out = new PrintWriter(cInt.getOutputStream(), true);
            out.println(s);
            cInt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
