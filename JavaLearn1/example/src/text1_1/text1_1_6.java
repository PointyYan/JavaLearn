package text1_1;

import java.util.Arrays;

public class text1_1_6 {
	public static void main(String[] args) {
		text1_1_6 hello=new text1_1_6();
		
        int[] scores={ 89 , -23 , 64 , 91 , 119 , 52 , 73};
        
        hello.asd(scores);
               
    }
    
    //定义方法完成成绩排序并输出前三名的功能
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
            System.out.println("考试成绩的前三名为：");
            for(int j=0;j<3;j++){
                System.out.println(scores[scores.length-j-1]);
            }
        }
    }
}
