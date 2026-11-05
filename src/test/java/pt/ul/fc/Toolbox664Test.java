package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox664Test {

    @Test
    void absoluteWorks() {
        assertEquals(5, Toolbox664.absolute(5));
        assertEquals(5, Toolbox664.absolute(-5));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Toolbox664.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Toolbox664.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Toolbox664.loud("hello"));
        assertEquals("ABC", Toolbox664.loud("aBc"));
    }
}
