package task6_list;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import java.util.Iterator;

import task6_list.one;

public class List {

	
	public static ArrayList<one> all = new ArrayList<one>();
	
	private Frame frame;
	private Label topLabel;
	private Label contLabel;
	private Label mLabel;

	List() {
		init();
	}

	public void init() {
		frame = new Frame("奖牌榜");
		frame.setBounds(300, 100, 200, 500);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());

		topLabel = new Label("奖牌榜");
		topLabel.setSize(200, 50);
		frame.add(topLabel);

		contLabel = new Label("国家 金牌 银牌 铜牌 总数 排名");
		frame.add(contLabel, null);

		
//		goNum();
		mLabel = new Label();
//		mLabel.setText();
		frame.add(mLabel);

		myEvent();

		frame.setVisible(true);
	}

	private void myEvent() {
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void goNum(){

		one china = new one("CHINA", 55, 12, 34);
		one usa = new one("USA", 22, 12, 34);
		one uk = new one("UK", 31, 12, 34);
		one q = new one("JAPAN", 3, 12, 34);
		one w = new one("GER", 54, 12, 34);
		one e = new one("SPAIN", 15, 12, 34);
		one r = new one("ITALY", 25, 12, 34);
		one t = new one("INDIA", 35, 12, 34);
		one y = new one("AUS", 45, 12, 34);
		one u = new one("DEN", 55, 12, 34);
		
		
		all.add(china);
		all.add(usa);
		all.add(e);
		all.add(u);
		all.add(y);
		all.add(t);
		all.add(r);
		all.add(w);
		all.add(uk);
		all.add(q);

	}
/*
	public String toString() {
		goNum();
		for (Iterator iterator = all.iterator(); iterator.hasNext();) {
			
			
			
		}
	}
*/	
	public static void main(String[] args) {
//		List frame = new List();

//		goNum();
//		System.out.println(all);
	}
}
