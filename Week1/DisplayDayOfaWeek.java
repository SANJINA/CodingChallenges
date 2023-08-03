package assignment.Day5;

import java.util.Scanner;

public class DisplayDayOfaWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7 representing the day of the week: ");
        int numberOfaDay = scanner.nextInt();

        if (numberOfaDay <= 0 || numberOfaDay > 7 ){
            System.out.println("Please enter a correct number as per instruction!");
        }else {
            switch (numberOfaDay){
                case 1: System.out.println("Sunday");
                    break;
                case 2: System.out.println("Monday");
                    break;
                case 3: System.out.println("Tuesday");
                    break;
                case 4: System.out.println("Wednesday");
                    break;
                case 5: System.out.println("Thursday");
                    break;
                case 6: System.out.println("Friday");
                    break;
                case 7: System.out.println("Saturday");
                    break;
            }
        }
        scanner.close();
    }
}
