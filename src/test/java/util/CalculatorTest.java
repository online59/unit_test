package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testPowerBasePositivePowerZero() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5, 0);

        assertEquals(1, result);
    }

    @Test
    void testPowerBasePositivePowerOne() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5, 1);

        assertEquals(5, result);
    }

    @Test
    void testPowerBasePositivePowerTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.power(2, 2);

        assertEquals(4, result);
    }

    @Test
    void testPowerBasePositivePowerNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.power(2, -1);

        assertEquals(-1, result);
    }

    @Test
    void testPowerBaseNegativePowerZero() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2, 0);

        assertEquals(1, result);
    }

    @Test
    void testPowerBaseNegativePowerOne() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2, 1);

        assertEquals(-2, result);
    }

    @Test
    void testPowerBaseNegativePowerTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2, 2);

        assertEquals(4, result);
    }

    @Test
    void testPowerBaseNegativePowerOddNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2, 3);

        assertEquals(-8, result);
    }

    @Test
    void testPowerBaseNegativePowerNegativeNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2, -1);

        assertEquals(-1, result);
    }

    @Test
    void testPowerBasePositivePowerVeryBigNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.power(2, 64);
        assertEquals(0, result);
    }
}
