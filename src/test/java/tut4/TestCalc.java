package tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

    Calc calc = new Calc();

    @Test
    void add() {
        assertEquals(calc.add(1,2), 3);
    }

    @Test
    void substract() {
        assertEquals(calc.subtract(2,1), 1);
    }
}