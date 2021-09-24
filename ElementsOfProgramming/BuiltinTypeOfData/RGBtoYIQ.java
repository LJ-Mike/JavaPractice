public class RGBtoYIQ {
	public static void main(String[] args) {
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);


		double Y = 0.299 * (R / 255.0) + 0.587 * (G / 255.0) + 0.114 * (B / 255.0);
		double I = 0.5959 * (R / 255.0)  + (-0.2746) * (G / 255.0) + (-0.3213) * (B / 255.0);
		double Q = 0.2115 * (R / 255.0) + (-0.5227) * (G / 255.0) + 0.3112 * (B / 255.0);



		System.out.printf("Convert RGB(%d, %d, %d) to YIQ(%.8f, %.8f, %.8f)\n", R, G, B, Y, I, Q);
	}
}