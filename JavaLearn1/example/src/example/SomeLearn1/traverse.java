package example.SomeLearn1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("Hello");
	    list.add("World");
	    list.add("Hahahaha");
	    
	    //��һ�ֱ�������ʹ��foreach����
	    for (String str : list) {
			System.out.println(str);
		}
	    
	    //�ڶ��ֱ������������Ϊ������ص����ݽ��б���   
	    String[] strArray =new String[list.size()];
	    list.toArray(strArray);
	    for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	    
	    //�����ֱ��� ʹ�õ��������б���
	    Iterator<String> ite = list.iterator();
	    while (ite.hasNext()) {
			 System.out.println(ite.next());
		}
	    
	    
	    
	}

}
