package assignment.Day8;

import java.util.Scanner;

public class FindTotalLegs {

    final static int CHICKENLEG = 2;
    final static int COWLEGS = 4;
    final static int PIGLEGS = 4;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter chickens count: ");
        int firstCount = scan.nextInt();
        System.out.println("Enter cows count: ");
        int secondCount = scan.nextInt();
        System.out.println("Enter pigs count: ");
        int thirdCount = scan.nextInt();
        scan.close();

        int sum = totalLegs(firstCount, secondCount, thirdCount);
        System.out.println("Total legs: " + sum);
    }

    //function that returns total legs
    private static int totalLegs(int chickenCount, int cowsCount, int pigsCount){
        int sum = chickenCount * CHICKENLEG + cowsCount * COWLEGS + pigsCount * PIGLEGS;
        return sum;
    }
}
