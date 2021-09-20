package tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

    Calc calc = new Calc();

    @Test
    void add() {
        assertEquals(calc.add(1,2), 2);
    }
}