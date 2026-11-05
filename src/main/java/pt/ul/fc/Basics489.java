package pt.ul.fc;

/** Small utility class. */
public class Basics489 {

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double c) {
        return c * 9.0 / 5.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int multiply(int value) {
        return value * 9;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int area(int width, int height) {
        return width * height;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean hasEvenParity(int value) {
        return value % 2 != 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the sum of a and b.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }
}
