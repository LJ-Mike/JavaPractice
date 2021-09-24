public class RGBtoCMYK {
	public static void main(String[] args) {
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);


		double R1 = R / 255.0;
		double G1 = G / 255.0;
		double B1 = B / 255.0;

		double K = 1 - Math.max(R1, Math.max(G1, B1));
		double C = (1 - R1 - K) / (1 - K);
		double M = (1 - G1 - K) / (1 - K);
		double Y = (1 - B1 - K) / (1 - K);

		System.out.printf("Convert RGC(%d, %d, %d) to CMYK(%.6f, %.6f, %.6f, %.6f)\n", R, G, B, C, M, Y, K);

		System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
	}
}