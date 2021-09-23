public class Stats5 {
	public static void main(String[] args) {
		double num1 = Math.random();
		double num2 = Math.random();
		double num3 = Math.random();
		double num4 = Math.random();
		double num5 = Math.random();

		double average = (num1 + num2 + num3 + num4 + num5) / 5;

		double min = Math.min(Math.min(num1, num2), Math.min(Math.min(num3, num4), num5));
		double max = Math.max(Math.max(num1, num2), Math.max(Math.max(num3, num4), num5));

		System.out.printf("Average is %.8f, min is %.8f, max is %.8f\n", average, min, max);
	}
}