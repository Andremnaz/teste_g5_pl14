package pt.ul.fc;

/** Small utility class. */
public class Calc698 {

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 != 0;
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int amplify(int value) {
        return value * 9;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int plus(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean positive(int number) {
        return number > 0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return w * h;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }
}
