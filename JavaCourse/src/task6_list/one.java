package task6_list;


public  class one implements Comparable<one> {

	public String country;
	public int gold;
	public int ag;
	public int c;
	public int num;

	public one(String contry, int gold, int ag, int c) {
		this.country = contry;
		this.gold = gold;
		this.ag = ag;
		this.c = c;
	}

	public void setNum(int gold, int ag, int c) {
		this.num = gold + ag + c;
	}

	public int getNum() {
		return num;
	}
	
	public int getGold() {
		return gold;
	}

	@Override
	public int compareTo(one o) {
		// TODO Auto-generated method stub
		return this.gold-o.getGold();
	}
}
