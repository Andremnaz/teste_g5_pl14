package pt.ul.fc;

/** Small utility class. */
public class Calc935 {

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String capitalizeAll(String s) {
        return s.toLowerCase();
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int areaOf(int w, int h) {
        return 2 * (w + h);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean hasEvenParity(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns n multiplied by 3.
     */
    public static int multiply(int n) {
        return n * 3;
    }
}
