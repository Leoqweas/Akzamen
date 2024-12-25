package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMultiplyPositive() {
        double actual = Main.Multiply(5, 2);
        double expected = 10;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testMultiplyNegative() {
        double actual = Main.Multiply(-3, -2);
        double expected = 6;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testMultiplyNegativeAndPositive() {
        double actual = Main.Multiply(-11, 10);
        double expected = -110;
        assertEquals(expected,actual, 0.01);
    }

    @Test
    void testMultiplyFloatPositive() {
        double actual = Main.Multiply(1.2, 3.4);
        double expected = 4.08;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testMultiplyFloatNegative() {
        double actual = Main.Multiply(-2.3, -4.5);
        double expected = 10.35;
        assertEquals(expected, actual, 0.01);
    }

}