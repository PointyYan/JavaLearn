package text1_1;
import java.util.Scanner;

public class text1_1_4 {
    public static void main(String[] args) {
	   int numClass=3;
	   int numStudent=4;
	   double sum=0;
	   double avg=0;
	   Scanner input=new Scanner(System.in);
	   for(int i=1;i<=numClass;i++){
		   System.out.println("�������"+i+"���༶�ĳɼ�:");
		   for(int j=1;j<=numStudent;j++){
			   System.out.print("**�������"+j+"��ѧ���ĳɼ�:");
			   int score=input.nextInt();
			   sum=score+sum;
		   }
		   avg=sum/numStudent;
		   System.out.println("��"+i+"�༶��ƽ������"+avg);
		   sum=0;
	   }
	
    }
}
