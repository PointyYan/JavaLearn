package text1_2;

import java.io.*;

public class text1_2_2 {
	public static void main(String[] args)throws IOException{
		char c;
		//ʹ��system.in���� BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�����ַ�,����'q'���˳���");
		//��ȡ�ַ�
		do {
			c=(char) br.read();
			System.out.println(c);
		} while (c !='q');
				
	}

}
