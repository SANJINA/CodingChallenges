package assignment.Day8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word or numbers: ");
        String input = s.nextLine();
        s.close();
        //check palindrome
        String reverseInput = "";
        char[] inputArray = input.toCharArray();
        System.out.println("Input as array: " + java.util.Arrays.toString(inputArray));

        for(int i = inputArray.length - 1; i >= 0; i--){
            reverseInput = reverseInput + inputArray[i];
        }

        //check palindrome
        if(input.equals(reverseInput)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("its not a palindrome");
        }
    }
}
