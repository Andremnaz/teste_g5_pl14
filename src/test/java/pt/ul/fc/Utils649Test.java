package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils649Test {

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Utils649.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Utils649.convertTemp(0.0), 1e-9);
    }

    @Test
    void absoluteWorks() {
        assertEquals(5, Utils649.absolute(5));
        assertEquals(5, Utils649.absolute(-5));
    }

    @Test
    void scaleWorks() {
        assertEquals(5 * 6, Utils649.scale(5));
        assertEquals(0, Utils649.scale(0));
    }
}
