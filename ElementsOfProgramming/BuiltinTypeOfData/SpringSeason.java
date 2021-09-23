public class SpringSeason {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);

		int numRep = m * 30 + d;
		int lower  = 3 * 30 + 20; // March 20
		int above  = 6 * 30 + 20; // June 20

		boolean isSpring = (numRep > lower) && (numRep < above);
		System.out.println(isSpring);
	}
}