package lab1;

public class Rachel implements  Homework{
    @Override
    public void homework(String[] args) {
        // put your code here to test


        System.out.println("Hello World");
    }

    // run the program to make sure everything is expected
    public static void main(String[] args){
        Rachel rachel = new Rachel();
        rachel.homework(args);
    }
}
