package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9802);
		Socket socket = server.accept();		
		
		/*download file
		File file = new File("f:\\scandate.txt");
		BufferedReader bout = new BufferedReader(new FileReader(file));		
		
		PrintStream socketout = new PrintStream(socket.getOutputStream(),true);       
		
		String string = bout.readLine();
		while(string!=null){
			socketout.print(string);
			string = bout.readLine();
			
			socketout.flush();			
		}
		socket.close();
		bout.close();
		*/
		Scanner socketin = new Scanner(socket.getInputStream());
		PrintWriter pout = new PrintWriter(new File("f:\\2.txt")); 
		
		while(socketin.hasNext()){					
			String ser = socketin.nextLine();
			pout.println(ser);
		}								
		
		socket.close();
		pout.close();
	}

}
