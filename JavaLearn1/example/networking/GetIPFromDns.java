package example.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPFromDns {
    public static void main(String[] args) {
        InetAddress hust = null;
        try {
            hust = InetAddress.getByName("www.hust.edu.cn");
//            hust = InetAddress.getByName()
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(hust);
    }
}
