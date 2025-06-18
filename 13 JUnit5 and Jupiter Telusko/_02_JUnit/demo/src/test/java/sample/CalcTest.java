package sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest 
{
    @Test
    public void test()
    {
        Calc calc = new Calc();
        int actual = calc.divide(10, 2);
        int expected = 5;
        assertEquals(expected, actual);
        System.out.println("First JUnit run");
    }
}