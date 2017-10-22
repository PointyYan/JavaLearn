package example.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress dont need new.

public class GetLocalHostIP {
    public static void main(String[] args) {
        InetAddress myIP4 = null;
        try {
            myIP4 = Inet4Address.getLocalHost();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println( myIP4);
    }
}
