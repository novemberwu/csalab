package lab2G11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScannerDistanceTest {
    private ScannerDistance homework =new ScannerDistance();


    private final InputStream standardIn = System.in;

    @BeforeEach
    public void setUp(){
    }

    @Test
    public void testDistanceInteger(){
        String simulatedInput = "30 40";
        double expected = 50.0;
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());

        // Redirect System.in to the ByteArrayInputStream
        System.setIn(input);
        double result = homework.distance();
        double epsilon = 1e-6;
        assertEquals(result, expected, epsilon);
    }

    @Test
    public void testDistanceDoulbe(){
        String simulatedInput = "1 1";
        double expected = 1.4142135623730951;
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());

        // Redirect System.in to the ByteArrayInputStream
        System.setIn(input);
        double result = homework.distance();
        double epsilon = 1e-6;

        assertEquals(result, expected, epsilon);
    }



    @AfterEach
    public void tearDown() {

        System.setIn(standardIn);
    }
}
