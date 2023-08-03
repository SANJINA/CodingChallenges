package assignment.week3.Day1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Enter the range of numbers (minimum and maximum, separated by a space): ");

        Scanner s = new Scanner(System.in);
        String range = s.nextLine();
        String[] rangeArray = range.split(" ");
        int minRange = Integer.parseInt(rangeArray[0]);
        int maxRange = Integer.parseInt(rangeArray[1]);
        //System.out.println(java.util.Arrays.toString(rangeArray));

        //Generate secret number
        Random random = new Random();
        int secretNumber =  random.nextInt(maxRange - minRange + 1) + minRange;
        //System.out.println(secretNumber);

        System.out.println("I've selected a number between " +minRange+ " and " + maxRange);
        System.out.println("You have 5 attempts to guess the number.");

        boolean guessed = false;
        int count = 1;
       while(count <= 5){
           System.out.println("Attempt #" + count + ": Enter your guess: ");
           int guess = s.nextInt();

           if(guess == secretNumber){
               guessed = true;
               System.out.println("Congratulations! You've guessed the correct number " + guess + " in " + count + " attempts.");
           }else if (guess < minRange || guess > maxRange){
               System.out.println("Invalid number. Please select a number between " +minRange+ " and " + maxRange);
           }else if (guess > secretNumber){
               System.out.println("Try a lower number.");
           }else{
               System.out.println("Try a higher number.");
           }
            count ++;
       }

       s.close();
       if (!guessed){
           System.out.println("Sorry, you cannot guess more than 5 times. The secret number was: " + secretNumber);
       }
    }
}
