package assignment.Day4;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of your choice: ");
        int numberEntered = scanner.nextInt();

        //initialize fizzcount and buzzcount to track cycle of 3 and 5
        int fizzCount = 0;
        int buzzCount = 0;

        if (numberEntered < 0){
            System.out.println("Please try again by entering a positive integer.");
        }else{
            for(int count = 1; count <= numberEntered; count++){
                    fizzCount = fizzCount + 1;
                    buzzCount = buzzCount + 1;

                if(fizzCount == 3 && buzzCount == 5){
                    System.out.println("FIZZBUZZ");
                    //reset both counts
                    fizzCount = 0;
                    buzzCount = 0;

                }else if (fizzCount == 3){
                    System.out.println("FIZZ");
                    //reset fizzCount
                    fizzCount = 0;

                }else if (buzzCount == 5){
                    System.out.println("BUZZ");
                    //reset buzzCount
                    buzzCount = 0;

                }else{
                    System.out.println(count);
                }
            }
        }
        scanner.close();
    }
}
