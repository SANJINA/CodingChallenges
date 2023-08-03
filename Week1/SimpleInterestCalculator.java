package assignment.Day5;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter principal amount: ");
        float principalAmt = scanner.nextFloat();

        System.out.println("Please enter interest rate: ");
        float rate = scanner.nextFloat();

        System.out.println("Please enter time period (in years): ");
        float years = scanner.nextFloat();

        float result = (principalAmt * rate * years ) / 100;

        System.out.println("The simple interest is: " + result);

        scanner.close();
    }
}
