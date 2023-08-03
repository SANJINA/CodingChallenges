package assignment.Day5;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int baseNum = scanner.nextInt();
        System.out.println("Enter the exponent:");
        int exponent =scanner.nextInt();

        int result = baseNum;

        for(int count = 1; count < exponent; count++){

            result = result * baseNum;
        }

        System.out.println(baseNum + "^" + exponent + " = " + result);
        scanner.close();
    }
}
