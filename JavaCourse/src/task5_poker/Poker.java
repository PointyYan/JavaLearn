package task5_poker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Poker {

	private List pages = new ArrayList<>();

	//整副扑克类
	public Poker() {
		// TODO Auto-generated constructor stub
		String[] color = new String[] { "黑桃", "红桃", "梅花", "方片" };
		String[] point = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < color.length; j++) {
				pages.add(new Page(color[j], point[i]));
			}
		}
		
		pages.add(new Page(" ", "大王"));
		pages.add(new Page(" ", "小王"));


	}
	
	//创建单张扑克牌
	public void PokerOne(){
		String[] color = new String[] { "黑桃", "红桃", "梅花", "方片" };;
		String[] point = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		System.out.println("请输入花色('黑桃', '红桃', '梅花', '方片'):");
		Scanner inColor = new Scanner(System.in);
		String inColor1 = inColor.next();
		System.out.println("请输入点数('A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K'):");
		Scanner inPoint = new Scanner(System.in);
		String inPoint1 = inPoint.next();
		pages.add(new Page(inColor1, inPoint1));
	}

	//单张扑克牌类
	public class Page {

		private String color = "";
		private String point = "";

		public Page(String color,String point ) {
			this.color = color;
			this.point = point;
		}
		
		public String show(){
			return this.color+this.point;
		}
		
	}
	
	public void ShowPages() {
		System.out.println("所有的扑克牌是：");
		for (Iterator i = pages.iterator(); i.hasNext();) {
			System.out.println(((Page)i.next()).show());

		}
	}


	public static void main(String[] args){
		Poker poker = new Poker();
		poker.ShowPages();
		poker.PokerOne();

	}
}
