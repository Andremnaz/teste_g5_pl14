package pt.ul.fc;

/** Small utility class. */
public class MathKit378 {

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String shout(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int biggest(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int amplify(int n) {
        return n + 6;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
