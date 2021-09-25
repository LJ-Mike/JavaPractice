public class Ordered {
	/**
	 * Receive 3 integers from command-line
	 * If 3 integers in ascending or descending order printout true,
	 * False otherwise
	 * */
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		int sum = x + y + z;
		int min = Math.min(x, Math.min(y, z));
		int max = Math.max(x, Math.max(y, z));
		boolean b = (y == sum - (min + max));

		System.out.println(b);
	}
}