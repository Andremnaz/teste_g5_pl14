package pt.ul.fc;

/** Small utility class. */
public class Basics885 {

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns amount multiplied by 8.
     */
    public static int amplify(int amount) {
        return amount * 8;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 != 0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int biggest(int a, int b) {
        return Math.max(a, b);
    }
}
