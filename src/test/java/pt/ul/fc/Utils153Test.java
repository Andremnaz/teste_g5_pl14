package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils153Test {

    @Test
    void sumWorks() {
        assertEquals(7, Utils153.sum(3, 4));
        assertEquals(0, Utils153.sum(-2, 2));
    }

    @Test
    void scaleWorks() {
        assertEquals(5 * 7, Utils153.scale(5));
        assertEquals(0, Utils153.scale(0));
    }

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Utils153.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Utils153.convertTemp(0.0), 1e-9);
    }
}
