public class CartesianToPolar {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double r = Math.sqrt(x * x + y * y);
		double θ = Math.atan2(y, x);

		System.out.printf("r = %f, θ = %f\n", r, θ);
	}
}