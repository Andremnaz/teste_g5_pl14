package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc698Test {

    @Test
    void loudWorks() {
        assertEquals("HELLO", Calc698.loud("hello"));
        assertEquals("ABC", Calc698.loud("aBc"));
    }

    @Test
    void amplifyWorks() {
        assertEquals(5 * 9, Calc698.amplify(5));
        assertEquals(0, Calc698.amplify(0));
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc698.surface(3, 4));
        assertEquals(35, Calc698.surface(5, 7));
    }
}
