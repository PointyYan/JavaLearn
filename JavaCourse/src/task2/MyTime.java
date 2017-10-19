package task2;

public class MyTime {

	public String hour;
	public String minute;
	public String second;

	public MyTime() {
		hour = "00";
		minute = "00";
		second = "00";
	}

	public MyTime(String hour, String minute, String second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setHour(String hour) {
		int i = Integer.valueOf(hour).intValue();
		if (i > 12 || i < 0) {
			i = 12;
			System.out.println("Please enter right hour.");
		}
		hour = Integer.toString(i);

		this.hour = hour;
	}

	public void setMinute(String minute) {
		int i = Integer.valueOf(minute).intValue();
		if (i > 60 || i < 0) {
			i = 0;
			System.out.println("Please enter right minute.");
		}
		minute = Integer.toString(i);
		this.minute = minute;
	}

	public void setSecond(String second) {
		int i = Integer.valueOf(second).intValue();
		if (i > 60 || i < 0) {
			i = 0;
			System.out.println("Please enter right second.");
		}
		second = Integer.toString(i);
		this.second = second;
	}

	public String getHour() {
		return hour;
	}

	public String getMinute() {
		return minute;
	}

	public String getSecond() {
		return second;
	}

}
