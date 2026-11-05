package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox397Test {

    @Test
    void timesWorks() {
        assertEquals(5 * 6, Toolbox397.times(5));
        assertEquals(0, Toolbox397.times(0));
    }

    @Test
    void isEvenWorks() {
        assertTrue(Toolbox397.isEven(4));
        assertFalse(Toolbox397.isEven(7));
    }

    @Test
    void biggestWorks() {
        assertEquals(9, Toolbox397.biggest(9, 2));
        assertEquals(9, Toolbox397.biggest(2, 9));
    }
}
