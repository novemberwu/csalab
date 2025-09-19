package lab2G10;

import lab1.DummySolution;
import lab1.Homework;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TwoDivideTest {


    @BeforeEach
    public void setUp() {
    }

    @Test
    public  void TestPositiveNumberTrueCase(){
        int a = 12;
        int b = 6;
        assertTrue(TwoDivide.twoDivide(a, b));
        assertTrue(TwoDivide.twoDivide(b,a));
        assertTrue(TwoDivide.twoDivide(-1* a, b));
        assertTrue(TwoDivide.twoDivide(-1 *b, a));
        assertTrue(TwoDivide.twoDivide(-1* a, -1* b));
        assertTrue(TwoDivide.twoDivide(-1 *b, -1 * a));
        assertTrue(TwoDivide.twoDivide( a, -1* b));
        assertTrue(TwoDivide.twoDivide( b, -1 * a));
    }

    @Test
    public  void TestPositiveNumberFalseCase(){
        int a = 12;
        int b = 7;

        assertFalse(TwoDivide.twoDivide(a, b));
        assertFalse(TwoDivide.twoDivide(b,a));
        assertFalse(TwoDivide.twoDivide(-1* a, b));
        assertFalse(TwoDivide.twoDivide(-1 *b, a));
        assertFalse(TwoDivide.twoDivide(-1* a, -1* b));
        assertFalse(TwoDivide.twoDivide(-1 *b, -1 * a));
        assertFalse(TwoDivide.twoDivide( a, -1* b));
        assertFalse(TwoDivide.twoDivide( b, -1 * a));
    }


    @AfterEach
    public void tearDown() {
    }

}
