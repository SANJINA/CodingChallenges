package assignment.Day3;

import java.util.Scanner;

public class DynamicCalculator {
    public static void main(String[] args) {

        int firstNumber , secondNumber;
        double result = 0.0;

        final String SUM = "+";
        final String SUB = "-";
        final String MUL = "*";
        final String DIV = "/";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Enter an operator (+, -, * or /): ");
        String operator = scanner.next();

        if(operator.equals(SUM))
        {
            result = firstNumber + secondNumber;
        }else if(operator.equals(SUB)){
            result = firstNumber - secondNumber;
        }else if(operator.equals(MUL)){
            result = firstNumber * secondNumber;
        }else if(operator.equals(DIV)){
            result = firstNumber / secondNumber;
        }else{
            System.out.println("Operation failed. Please type the right operator.");
        }

        System.out.println("Result: " + result);
    }
}
