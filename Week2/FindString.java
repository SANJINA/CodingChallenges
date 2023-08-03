package assignment.Day6;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {

        //Declare String array
        String[] names = {"ABC", "XYZ", "LION"};

        System.out.println("Enter the name to see if it exist in the array: ");

        Scanner scanner = new Scanner(System.in);
        String nameEntered = scanner.nextLine();

        boolean nameFound = false;

        for(int i = 0; i < names.length; i++){
            if (names[i].equals(nameEntered) ){
                nameFound = true;
                System.out.println("Hurray! The name(" + nameEntered + ") your entered exist in the array.");
                break;
            }
        }
        if (nameFound == false){System.out.println("Name entered not found.");}
    }
}
