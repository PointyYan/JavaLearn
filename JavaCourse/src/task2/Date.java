package task2;

import task2.DateYear;

public class Date {

	public DateYear year;
	public DateMonth month;
	public DateDay day;

	public Date(int year, int month, int day) {
		this.year = new DateYear(year);
		this.month = new DateMonth(month);
		this.day = new DateDay(day);
	}
	public void getYear(DateYear year) {
		this.year = year;
	}
	public void setYear(DateYear year) {
		this.year = year;
	}

	public DateMonth getMouth() {
		return month;
	}

	public void setMouth(DateMonth month) {
		this.month = month;
	}

	public DateDay getDay() {
		return day;
	}

	public void setDay(DateDay day) {
		this.day = day;
	}

}
