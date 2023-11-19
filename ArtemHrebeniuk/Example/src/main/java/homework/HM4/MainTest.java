package hm4;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void divPositiveIntegersTest() {
        double expected = 5;
        double actual = new Main().div(10, 2);
        assertEquals(actual, expected);

        expected = 25;
        actual = new Main().div(100, 4);
        assertEquals(actual, expected);
    }

    @Test
    public void divPositiveDecimalTest() {
        double expected = 4.2;
        double actual = new Main().div(10.5, 2.5);
        assertEquals(actual, expected, 0.01);

        expected = 3.57;
        actual = new Main().div(12.34, 3.45);
        assertEquals(actual, expected, 0.01);
    }

    @Test
    public void divZeroDivisionTest() {
        expected = 0;
        try {
            new Main().div(10, 0);
            fail("Division by zero should have thrown an exception.");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "The second argument cannot be zero.");
        }
    }
}
