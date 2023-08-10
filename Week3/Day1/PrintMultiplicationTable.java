package assignment.week3.Day1;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = s.nextInt();
        s.close();

        for(int i = 0; i <= 10; i++){
            System.out.println( number + "*" + i + " = " + number*i);
        }



    }
}
