package assignment.Day8;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        String sentence = new String("I love Codeacademy");

        String[] stringArray = sentence.split(" ");
        //System.out.println(java.util.Arrays.toString(stringArray));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the position of the word: ");
        int position = scan.nextInt();
        scan.close();

        System.out.println("The word in index " + position + " is: " + stringArray[position - 1]);
        System.out.println("The second last word is: " + stringArray[stringArray.length - 2]);
    }
}
