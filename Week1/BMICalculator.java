package assignment.Day5;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height (m): ");
        float height = scanner.nextFloat();

        float bmi = weight/(height * height);
        System.out.println("Your BMI: " + bmi);

        scanner.close();
    }
}
