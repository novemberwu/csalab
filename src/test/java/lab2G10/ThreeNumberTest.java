package lab2G10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeNumberTest {
    @BeforeEach
    public void setUp() {
    }

    private void assertAllFalse(int a, int b, int c){
        assertFalse(ThreeNumber.threeNumber(a, b, c));
        assertFalse(ThreeNumber.threeNumber(a, c, b));

        assertFalse(ThreeNumber.threeNumber(b, a, c));
        assertFalse(ThreeNumber.threeNumber(b, c, a));

        assertFalse(ThreeNumber.threeNumber(c, b, a));
        assertFalse(ThreeNumber.threeNumber(c, a, b));

    }
    private void assertAllTrue(int a, int b, int c){
        assertTrue(ThreeNumber.threeNumber(a, b, c));
        assertTrue(ThreeNumber.threeNumber(a, c, b));

        assertTrue(ThreeNumber.threeNumber(b, a, c));
        assertTrue(ThreeNumber.threeNumber(b, c, a));

        assertTrue(ThreeNumber.threeNumber(c, b, a));
        assertTrue(ThreeNumber.threeNumber(c, a, b));

    }

    @Test
    public void testInvalidInput(){
        int a = -3, b = 4, c = 5;
        assertAllFalse(a, b, c);
    }


    @Test
    public void testPositiveCase(){
        int a = 3, b = 4, c = 5;
        assertAllTrue(a, b, c);

    }
    @Test
    public void testNegativeCase(){
        int a = 11, b = 19, c = 8;
        assertAllFalse(a, b, c);
    }

    @Test
    public void testIntegerMaxCase(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE -1;
        int c = 2;
        assertAllTrue(a, b, c);
    }

    @AfterEach
    public void tearDown() {
    }
}
