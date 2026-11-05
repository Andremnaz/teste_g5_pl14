package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics538Test {

    @Test
    void positiveWorks() {
        assertTrue(Basics538.positive(3));
        assertFalse(Basics538.positive(-3));
        assertFalse(Basics538.positive(0));
    }

    @Test
    void meanWorks() {
        assertEquals(5.0, Basics538.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics538.mean(-1.0, 1.0), 1e-9);
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, Basics538.rectArea(3, 4));
        assertEquals(35, Basics538.rectArea(5, 7));
    }
}
