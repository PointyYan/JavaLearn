package text1_2;

import java.util.Date;
import java.text.*;

public class text1_2_1 {
	
    public static void main(String[] args) {
    	
    	Date date = new Date();

    	System.out.println(date.toString());
 
        //c��ʹ��  
        System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date);          
        //f��ʹ��  
        System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
        //d��ʹ��  
        System.out.printf("��/��/���ʽ��%tD%n",date);  
        //r��ʹ��  
        System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
        //t��ʹ��  
        System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
        //R��ʹ��  
        System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",date);  
    	
    	Date dNow = new Date();
    	
    	System.out.println(dNow);
	
	}
}
