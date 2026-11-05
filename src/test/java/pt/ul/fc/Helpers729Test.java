package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers729Test {

    @Test
    void meanWorks() {
        assertEquals(5.0, Helpers729.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Helpers729.mean(-1.0, 1.0), 1e-9);
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, Helpers729.areaOf(3, 4));
        assertEquals(35, Helpers729.areaOf(5, 7));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Helpers729.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Helpers729.toFahrenheit(0.0), 1e-9);
    }
}
