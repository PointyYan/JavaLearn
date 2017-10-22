package example.networking;

//import example.Io.DataInputS;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
//import java.net.UnknownHostException;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("107.0.0.1", 5432);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());

            dis.close();
            s1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
