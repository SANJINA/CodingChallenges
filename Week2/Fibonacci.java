package assignment.Day8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the count of numbers you want to print: ");
        int count = s.nextInt();
        s.close();

        int firstNum = 0;
        int secondNum = 1;

        for(int i = 0; i < count; i++){
            if(i == count - 1) {
                System.out.print( firstNum );
            }else{
                System.out.print( firstNum + ", ");
            }
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
