import lab1.DummySolution;
import lab1.Homework;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

self evaluation
*/

public class Lab1Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private ArrayList<Homework> homeworks = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        homeworks.add( new DummySolution());
    }


    @Test
    void testHomework() {

        String[] args = new String[]{"Rachel", "Joe", "Ross"};

        for(Homework homework: this.homeworks){
            homework.homework(args);
            assertEquals("Hi Ross, Joe and Rachel", outputStreamCaptor.toString().trim());

        }

    }


    @Test
    void testHomeworkInvalidInput(){
        String[] args = new String[]{"Rachel"};

        for(Homework homework: this.homeworks){
            homework.homework(args);
            assertEquals("",outputStreamCaptor.toString().trim());

        }


    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
