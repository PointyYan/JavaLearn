package example.SomeLearn1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TraMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		map.put("1", "Value1");
		map.put("2", "Value2");
		map.put("3", "Value3");

		//first:�ձ�ʹ�ã�����ȡֵ
		System.out.println("ͨ��Map��keySet����key��value��");
		for (String key : map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}
		
		//second
		System.out.println("ͨ��Map.entrySetʹ��iterator����key��valu��");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		
	}

}
