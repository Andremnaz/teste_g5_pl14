package pt.ul.fc;

/** Small utility class. */
public class Toolbox397 {

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns amount multiplied by 6.
     */
    public static int times(int amount) {
        return amount * 6;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double avg(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w * h;
    }
}
