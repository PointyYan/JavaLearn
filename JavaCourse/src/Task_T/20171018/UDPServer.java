package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		DatagramSocket server = new DatagramSocket(9800);
		
		byte[] byt = new byte[128];
		DatagramPacket recpPacket = new DatagramPacket(byt, byt.length);
		
		server.receive(recpPacket);
		
		String string = new String(recpPacket.getData(),0,recpPacket.getLength());
		System.out.println(string);
		
		int port = recpPacket.getPort();
		InetAddress address = recpPacket.getAddress();
		String ansString = "hi,this is server";
		byte[] sendstr = ansString.getBytes();
		
		DatagramPacket sendp = new DatagramPacket(sendstr , sendstr.length, address, port);
		server.send(sendp);
		
		server.close();
		

	}

}
