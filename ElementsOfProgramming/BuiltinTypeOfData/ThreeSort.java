public class ThreeSort {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		int min = Math.min(num1, Math.min(num2, num3));
		int max = Math.max(num1, Math.max(num2, num3));

		System.out.println(min);
		System.out.println(num1 + num2 + num3 - min - max);
		System.out.println(max);
	}
}