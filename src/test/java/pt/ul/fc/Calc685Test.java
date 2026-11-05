package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc685Test {

    @Test
    void sumWorks() {
        assertEquals(7, Calc685.sum(3, 4));
        assertEquals(0, Calc685.sum(-2, 2));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 8, Calc685.multiply(5));
        assertEquals(0, Calc685.multiply(0));
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc685.surface(3, 4));
        assertEquals(35, Calc685.surface(5, 7));
    }
}
