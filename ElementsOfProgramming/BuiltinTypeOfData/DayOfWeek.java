public class DayOfWeek {
	public static void main(String[] args) {
		// constant variables
		final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		final String[] months = {"", "January", "February", "March",
								"April", "May", "June", "July", "August", "September",
								"October", "November", "December"};


		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12);

		System.out.printf("The day of the week of %s %2d, %4d is %s\n", months[m], d, y, days[d1 % 7]);

	}
}