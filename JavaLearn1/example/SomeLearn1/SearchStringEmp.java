package example.SomeLearn1;

public class SearchStringEmp {

	public static void main(String[] args) {

		String strOrig = "Google Runoob Taobao";
		int intIndex = strOrig.indexOf("Runoob");
		if (intIndex == -1) {
			System.out.println("Don't find Runoob.");
		} else {
			System.out.println("Runoob �ַ���λ��" + intIndex);
		}
	}
}
