public class SumOfTwoDice {
    public static void main(String[] args) {
        double first = Math.random();
        double second = Math.random();

        int one = (int) (first * 6) + 1;
        int two = (int) (second * 6) + 1;

        int sum = one + two;
        System.out.printf("Sum of two dice %d and %d is %d\n", one, two, sum);
    }
}
