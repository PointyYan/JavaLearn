package text1_1;

import java.util.Arrays;

public class text1_1_5 {
public static void main(String[] args) {
        
        // �������󣬶�����Ϊhello
	    text1_1_5 hello = new text1_1_5(); 
        
        // ���÷�����������ֵ�����ڱ�����
        int maxScore=hello.getMaxAge();
        
		// ����������
		System.out.println("�������Ϊ��" + maxScore); 
		
		int maxScore02=hello.getMaxAge02();
		System.out.println("�������Ϊ��" + maxScore02);
	}

	/*
	 * ���ܣ����ѧ����������ֵ 
     * ����һ���޲εķ���������ֵΪ��������ֵ
     * �ο����裺
     * 1������һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ 18 ,23 ,21 ,19 ,25 ,29 ,17
     * 2������һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
     * 3��ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ
     * 4��ʹ�� return �������ֵ
	 */
	public int getMaxAge() {
	
    int[] ages={18 ,23 ,21 ,19 ,25 ,29 ,17};
    int max=ages[0];
    for(int i=1;i<ages.length;i++){
        if(ages[i]>max){
            max=ages[i];
        }
    }
    return max;    
	}
	
	public int getMaxAge02(){
		int[] ages={18 ,23 ,21 ,19 ,25 ,29 ,17};
		Arrays.sort(ages);
		int max=ages[ages.length-1];
		return max;
	    
	}

}
