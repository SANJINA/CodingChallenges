package assignment.Day5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your marks obtained: ");
        float marksObtained = scanner.nextFloat();

        if(marksObtained > 100){
            System.out.println("Please enter the value less then 100.");
        } else if (marksObtained >= 90 && marksObtained <= 100 ) {
            System.out.println("Grade: A");
        } else if (marksObtained >= 80 && marksObtained <= 89) {
            System.out.println("Grade: B");
        } else if (marksObtained >= 70 && marksObtained <= 79) {
            System.out.println("Grade: C");
        } else if (marksObtained >= 60 && marksObtained <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
