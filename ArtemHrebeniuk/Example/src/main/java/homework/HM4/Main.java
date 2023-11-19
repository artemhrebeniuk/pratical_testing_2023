package hm3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public double divide(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("The second argument cannot be zero.");
        }
        return first / second;
    }

    public static String readFromConsole(String welcomeMessage) {
        System.out.println(welcomeMessage);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double readDoubleFromConsole(String welcomeMessage) {
        double result = 0.0;
        while (true) {
            System.out.println(welcomeMessage);
            try {
                result = Double.parseDouble(readFromConsole(welcomeMessage));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid double value:");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double firstNumber = readDoubleFromConsole("Enter your first double number: ");

        while (true) {
            double secondNumber = readDoubleFromConsole("Enter your second double number: ");
            try {
                double result = new Main().divide(firstNumber, secondNumber);
                System.out.println("Result = " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
