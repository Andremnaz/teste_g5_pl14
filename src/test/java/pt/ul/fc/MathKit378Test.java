package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit378Test {

    @Test
    void shoutWorks() {
        assertEquals("HELLO", MathKit378.shout("hello"));
        assertEquals("ABC", MathKit378.shout("aBc"));
    }

    @Test
    void addWorks() {
        assertEquals(7, MathKit378.add(3, 4));
        assertEquals(0, MathKit378.add(-2, 2));
    }

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, MathKit378.distanceFromZero(5));
        assertEquals(5, MathKit378.distanceFromZero(-5));
    }
}
