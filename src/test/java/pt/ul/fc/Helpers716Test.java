package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers716Test {

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Helpers716.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Helpers716.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void shoutWorks() {
        assertEquals("HELLO", Helpers716.shout("hello"));
        assertEquals("ABC", Helpers716.shout("aBc"));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Helpers716.sum(3, 4));
        assertEquals(0, Helpers716.sum(-2, 2));
    }
}
