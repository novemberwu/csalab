package lab2G10;

public class ThreeNumber {

    public static boolean threeNumber(int a, int b, int c){
       return (a+b)> c  && (a+c)>b && (b+c)> a;
    }
    public static void main(String[] args){
        // validations on user input
        if(args.length != 3) return;
        // convert user input from String to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // TODO: your implementation here
        // step 1: check all inputs are positive numbers
        // step 2: check if the three number can form triangle
        // i.e. a + b > c, a + c > b, and b + c > a
        System.out.println(threeNumber(a, b, c));


    }
}

