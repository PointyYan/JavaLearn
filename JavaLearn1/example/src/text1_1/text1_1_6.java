package text1_1;

import java.util.Arrays;

public class text1_1_6 {
	public static void main(String[] args) {
		text1_1_6 hello=new text1_1_6();
		
        int[] scores={ 89 , -23 , 64 , 91 , 119 , 52 , 73};
        
        hello.asd(scores);
               
    }
    
    //���巽����ɳɼ��������ǰ�����Ĺ���
    public void asd(int[] scores){
        Arrays.sort(scores);
        int num1=0;
        for ( int i = scores.length - 1; i >= 0; i-- ) { 
            if(scores[i]<0||scores[i]>100){
                continue;
            }else{
                num1++;
            }
        }
        if(num1>=3){
            System.out.println("���Գɼ���ǰ����Ϊ��");
            for(int j=0;j<3;j++){
                System.out.println(scores[scores.length-j-1]);
            }
        }
    }
}
