package hw_fourth;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void divTest(){
        //1, 3
        double expected = 2;
        double actual = new Main().div(16, 8);
        assertEquals(actual, expected);
    }

}