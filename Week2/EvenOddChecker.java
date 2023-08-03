package assignment.Day7;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        //user input
        Scanner s = new Scanner(System.in);

        //array size
        System.out.println("Please enter the length of array: ");
        int arraySize = s.nextInt();

        //declare int array
        int[] numbers = new int[arraySize];
        System.out.println("Please enter elements of the array: ");
        //initialize array elements
        for(int i = 0; i < arraySize ; i++){
            numbers[i] = s.nextInt();
        }

        s.close();
        //Print array
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        checkEvenOdd(numbers);
    }

    public static void checkEvenOdd(int @NotNull [] array){

        for(int i = 0; i < array.length; i++){
            if((array[i] % 2) == 0){
                System.out.println(array[i] + " is even.");
            }else{
                System.out.println(array[i] + " is odd.");
            }
        }
    }
}
