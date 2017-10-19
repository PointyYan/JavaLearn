package task2;

public class DateMonth {

	private int month;

	public DateMonth(int month) {
		if (month < 0) {
			System.out.println("Please enter a year month than 0 and smaller than 13.");
		} else if (month > 13) {
			System.out.println("Please enter a year month than 0 and smaller than 13.");
		} else {
			this.month = month;
		}

	}
}
