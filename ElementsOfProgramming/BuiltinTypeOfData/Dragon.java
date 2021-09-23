public class Dragon {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("F");
		int count = 5;
		while (count-- > 0) {
			int oldLength = str.length();
			str.append("L");
			while (oldLength-- > 0) {
				if (str.charAt(oldLength) == 'L') {
					str.append("R");
				} else if (str.charAt(oldLength) == 'R') {
					str.append("L");
				} else {
					str.append(str.charAt(oldLength));
				}
			}
		}
		System.out.println(str.toString());

		test();
	}
}