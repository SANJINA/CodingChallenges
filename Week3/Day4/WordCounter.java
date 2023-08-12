package assignment.week3.Day4;

//Write a Java program that takes a sentence as input and
// prints the frequency of each word using a map.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();

        String[] words = sentence.split(" ");

        // Create a map to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            word = word.toLowerCase();
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }


        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        s.close();
    }
}
