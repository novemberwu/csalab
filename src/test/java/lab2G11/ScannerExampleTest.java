package lab2G11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScannerExampleTest {

    private ScannerExample homework =new  ScannerExample();


    private final PrintStream standardOut = System.out;
    private final InputStream standardIn = System.in;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testStringInput(){
        String simulatedInput = "Hello World";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());

        // Redirect System.in to the ByteArrayInputStream
        System.setIn(input);
        homework.scan();
        assertEquals("Hello\nWorld",outputStreamCaptor.toString().trim());
    }
    @Test
    public void testStringInput1(){
        String simulatedInput = "Good\tDay";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());

        // Redirect System.in to the ByteArrayInputStream
        System.setIn(input);
        homework.scan();
        assertEquals("Good\nDay",outputStreamCaptor.toString().trim());
    }


    @AfterEach
    public void tearDown() {

        System.setIn(standardIn);
        System.setOut(standardOut);
    }


}
