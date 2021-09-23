public class SumOfSines {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);


		double sum = Math.sin(Math.toRadians(2 * t)) + Math.sin(Math.toRadians(3 * t));


		System.out.printf("Sum is %f\n", sum);
	}
}