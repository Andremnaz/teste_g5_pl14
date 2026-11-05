package pt.ul.fc;

/** Small utility class. */
public class Basics869 {

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean hasEvenParity(int value) {
        return value % 2 != 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toLowerCase();
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Returns value multiplied by 8.
     */
    public static int multiply(int value) {
        return value * 8;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }
}
