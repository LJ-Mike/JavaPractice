public class CMYKtoRGB {
	public static void main(String[] args) {
		double C = Double.parseDouble(args[0]);
		double M = Double.parseDouble(args[1]);
		double Y = Double.parseDouble(args[2]);
		double K = Double.parseDouble(args[3]);

		int R = (int) Math.round(255 * (1 - C) * (1 - K));
		int G = (int) Math.round(255 * (1 - M) * (1 - K));
		int B = (int) Math.round(255 * (1 - Y) * (1 - K));

		System.out.printf("Convert CMYK(%.6f, %.6f, %.6f, %.6f) to RGB(%d, %d, %d)\n", C, M, Y, K, R, G, B);
	}
}