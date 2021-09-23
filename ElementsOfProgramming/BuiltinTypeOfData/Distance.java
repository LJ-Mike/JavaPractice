/**
 * Read 2 numbers from comman-line argument
 * Calculate Euclidean distance from (x, y) to (0, 0)
 */
public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt((double) x * x + y * y);
        System.out.printf("Euclidean distance from (%d, %d) to (0,0) is: %f\n", x, y, distance);
    }
}
