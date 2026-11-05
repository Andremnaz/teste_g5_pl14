package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

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
    @Test
    void sumWorks(){
        assertEquals(3,Toolbox397.sum(1,3));
        assertEquals(0, Toolbox397.sum(0,0));
    }
    @Test
    void distanceFromZeroWorks(){
        assertEquals(9,Toolbox397.distanceFromZero(-9));
        assertEquals(7, Toolbox397.distanceFromZero(9));
    }
}
