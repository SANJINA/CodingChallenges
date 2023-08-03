package assignment.Day7;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        //take input as array of integers
        //int[] number = {1,2,3,4,5,6};

        //refactor: input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        //declare array with input length
        int[] nums = new int[arrayLength];

        //initialize array with input from user
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arrayLength; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println("Array:Numbers: " + java.util.Arrays.toString(nums));

        //target integer from user
        System.out.println("Enter number you want to find in the array: ");
        int numToSearch = scanner.nextInt();

        //check if target integer is present in array
        boolean isPresent = false;
        int index = 0;
        for(int i = 0; i < arrayLength; i++){
            if(nums[i] == numToSearch){
                isPresent = true;
                index = i;
                break;
            }
        }

        //print its index if found
        //else print a message: Not found
        if(isPresent){
            System.out.println("The number is in array index: " + index);
        }else{
            System.out.println("Number not Found!");
        }


        scanner.close();

    }
}
