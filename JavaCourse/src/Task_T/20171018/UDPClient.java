package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception {				
		
		InetAddress address =InetAddress.getByName("127.0.0.1");
		int port =9800;
		byte[] data ="hello world, this is client".getBytes();
		
		DatagramPacket packet = new DatagramPacket(data,data.length,address,port);
		
		DatagramSocket socket =new DatagramSocket();
		
		socket.send(packet);

		
		byte[] recdata = new byte[1024];
		DatagramPacket recpacket = new DatagramPacket(recdata,recdata.length);
		
		socket.receive(recpacket);
		String reply = new String(recdata,0,recpacket.getLength());
		System.out.println("thanks"+reply);
		
		socket.close();
	}

}
