public class YIQtoRGB {
	public static void main(String[] args) {
		double Y = Double.parseDouble(args[0]);
		double I = Double.parseDouble(args[1]);
		double Q = Double.parseDouble(args[2]);

		double R = 1 * Y + 0.956 * I + 0.619 * Q;
		double G = 1 * Y + (-0.272) * I + (-0.647) * Q;
		double B = 1 * Y + (-1.106) * I + 1.703 * Q;

		System.out.printf("Convert YIQ(%.6f, %.6f, %.6f) to RGB(%d, %d, %d)\n", Y, I, Q, Math.round(R), Math.round(G), Math.round(B));
	}
}