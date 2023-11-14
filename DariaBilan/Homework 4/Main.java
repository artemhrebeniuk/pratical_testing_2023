package hw_fourth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public double div(double first, double second){
        if(second == 0){
            throw new ArithmeticException("Second arg can't be zero");
        }
        return first / second;
    }

//    public static double readDoubleFromConsole(String welcomeMessage){
//        System.out.println(welcomeMessage);
//        Scanner sc = new Scanner(System.in);
//        double result = 0.0;
//        try {
//            result = sc.nextDouble();
//        }catch (InputMismatchException e){
//            System.out.println("Enter DOUBLE value:");
//            readDoubleFromConsole(welcomeMessage);
//        }
//        return result;
//    }

    public static String readFromConsole(String welcomeMessage){
        System.out.println(welcomeMessage);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
}

    public static double readDoubleFromConsole(String welcomeMessage){
        double result = 0.0;
        while (true) {
                try {
                    result = Double.parseDouble(readFromConsole(welcomeMessage));
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter DOUBLE value:");
                }
            }
        return result;
    }


    public static void main(String[] args) {
        double first = readDoubleFromConsole("Enter your first double number: ");

        while(true) {
            double second = readDoubleFromConsole("Enter your second double number: ");
            try {
                double result = new Main().div(first, second);
                System.out.println("Result = " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }


    }

}
