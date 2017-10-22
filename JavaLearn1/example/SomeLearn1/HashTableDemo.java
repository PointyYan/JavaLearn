package example.SomeLearn1;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		// Creat a hash map
		Hashtable<Object, Object> balance = new Hashtable<>();
		Enumeration<Object> names;
		String str;
		double bal;

		balance.put("Zara", new Double(3434.34));
		balance.put("Yan", new Double(1212.12));
		balance.put("Mao", new Double(1313.13));
		balance.put("Huang", new Double(9812.98));
		balance.put("Ta", new Double(4545.54));
		

		// show all balance in a hash table.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ":" + balance.get(str));
		}
		System.out.println();
		// Depoist 1,000 into Zara's account
		bal = ((Double) balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal + 1000));
		System.out.println("Zara's new balance: " + balance.get("Zara"));

	}
}
