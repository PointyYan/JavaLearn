package socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1",9802);
		/* download file		
		Scanner socketin = new Scanner(client.getInputStream());
		PrintWriter pout = new PrintWriter(new File("f:\\1.txt")); 
		
		while(socketin.hasNext()){					
			String ser = socketin.nextLine();
			pout.println(ser);
		}								
		
		client.close();
		pout.close();
		*/
		
		//upload file
		BufferedReader pr = new BufferedReader(new FileReader(new File("f:\\1.txt"))); 
		PrintWriter socketout = new PrintWriter(client.getOutputStream());
		String string = pr.readLine();
		while(string!=null){
			socketout.println(string);
			string = pr.readLine();
			socketout.flush();
		}								
		
		client.close();
		pr.close();
	}

}
