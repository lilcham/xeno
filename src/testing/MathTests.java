package testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathTests {
    private Math math;

    @BeforeEach
    public void setUp() {
        //create the object
        math = new Math();
    }

    @Test
    public void testSimpleAddition() {
        int expected = 4;
        int actual = math.add(2,2);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testSimpleMultiplication() {
        int expected = 6;
        int actual = math.multiply(2,3);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testSimpleDivision() {
        final double expected = 2.0;

        final double actual = math.divide(10, 5);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIllegalDivision() {
        try {
            math.divide(10, 0);
            //Exception should be thrown as you can't divide by 0
            Assertions.fail("Fail: No Exception Thrown");
        } catch (IllegalArgumentException e) {
            //Should catch this exception
        } catch (Exception e) {
            //Wrong Exception is thrown as it misses the above catch
            Assertions.fail("Fail: Incorrect Exception Thrown");
        }
    }

    @AfterEach
    public void tearDown() {
        //Clean up
        math = null;
    }

}
