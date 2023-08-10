package assignment.week3.Day1;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = s.next();

        System.out.println("Please enter a char: ");
        String input = s.next();
        char ch = input.charAt(0);
        s.close();

        //convert word into char array
        char[] wordAsArray = word.toCharArray();
        int charCount = 0;
        boolean charFound = false;

        for(int i = 0; i < wordAsArray.length; i++){
            if(wordAsArray[i] == ch){
                charFound = true;
                charCount++;
            }
        }

        if(charFound){
            System.out.println(word + " and " + Character.toString(ch) + "  -> " + charCount);
        }else{
            System.out.println("The character you entered is not present in the word.");
        }
    }
}
