package stringverify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class areaTest {
    

    // ❤️ Using AssertEquals() 
    @Test
    void test_Compute_Square_Area()
    {
        areaCalculate shape1 = new areaCalculate();
        assertEquals(576, shape1.computeSquareArea(24));
    }

    // ❤️ Using AssertNotEquals()
    @Test
    void test_Compute_Square_Area2()
    {
        areaCalculate shape1 = new areaCalculate();
        assertNotEquals(1001, shape1.computeSquareArea(24));  // PASS when result doesn't equals

        // assertNotEquals(576, shape1.computeSquareArea(24));
        // assertNotEquals will fail the test if the expected value is equal to the actual value.
        // Its opposite of assertEquals()
    }

    // ❤️ Using assertEquals() with message
    @Test
    void test_Compute_Circle_Area()
    {
        areaCalculate shape2 = new areaCalculate();
        // message will be displayed if the test fails, and is optional.
        assertEquals(78.5, shape2.computeCircleArea(5), "Area of Circle failed");

        // Here, message will be evaluated for both when test passes and fails.
        // If the test passes, the message will not be displayed but will be evaluated.


    }

    // ❤️ Using assertEquals() with Lambda expression message
    @Test
    void test_Compute_Circle_Area_2(){
        areaCalculate shape3 = new areaCalculate();
        // Soln: To make message only evaluate when test case fails we can make use of Lambda expressions.
        // assertEquals(78.5, shape2.computeCircleArea(5), ()->"Area of Circle failed");
        assertEquals(78.5, shape3.computeCircleArea(5), () -> "Area of Circle failed");
    }

    // ❤️ Using assertTrue()
    @Test
    void test_Compute_Circle_Area_3()
    {
        areaCalculate shape4 = new areaCalculate();
        // assertTrue() will pass if the condition is true, otherwise it will fail.
        assertTrue(shape4.computeCircleArea(5) == 78.5); // True, will pass the test
        // assertTrue(shape4.computeCircleArea(5) == 100); // False, will fail the test
    }

    // ❤️ Using asserFalse()
    @Test
    void test_Compute_Circle_Area_4()
    {
        areaCalculate shape5 = new areaCalculate();
        // assertFalse() will pass the test if the condition is false, otherwise it will fail.
        assertFalse(shape5.computeCircleArea(5) == 100);    // False, will pass the test
        // assertFalse(shape5.computeCircleArea(5) == 78.5); // True, will fail the test
    }

}
