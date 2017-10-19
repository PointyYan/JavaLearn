package task2;

public class DateYear {

	private int year;

	public DateYear(int year) {
		if (year < 0) {
			System.out.println("Please enter a year greater than 0.");
		} else {
			this.year = year;
		}

	}
}
