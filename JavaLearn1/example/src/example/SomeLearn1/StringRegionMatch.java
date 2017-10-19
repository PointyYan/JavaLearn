package example.SomeLearn1;

public class StringRegionMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first_str = "Welcome to Microsoft";
		String secong_str = "I work with microsoft";
		boolean match1=first_str.regionMatches(11, secong_str, 12, 9);
		boolean match2 = first_str.regionMatches(true, 11, secong_str, 12, 9);
		System.out.println("���ִ�Сд����ֵ��"+match1);
		System.out.println("�����ִ�Сд����ֵ��"+match2);
	}

}
 