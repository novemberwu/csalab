package lab2G10;

public class TwoDivide {

    public static boolean twoDivide(int a, int b){

       return false;

    }

    public static void main(String[] args){
        // validations on user input
        if(args.length != 2) return;
        if("0".equals(args[0]) || "0".equals(args[1]))return;

        // convert user input from String to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        //TODO: Your code here

        System.out.println(TwoDivide.twoDivide(a,b));

    }
}

