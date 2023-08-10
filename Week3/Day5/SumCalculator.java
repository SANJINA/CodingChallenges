package assignment.week3.Day5;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        System.out.println("Please enter first integer: ");
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        System.out.println("Please enter second integer: ");
        int number2 = s.nextInt();

        int sum = sumDouble(number1, number2);
        System.out.println("Sum is: " + sum);
        s.close();
    }

    public static int sumDouble(int n1, int n2){
        int sum = 0;
        if(n1 == n2){
            sum = (n1 + n2) * 2;
        }else{
            sum = n1 + n2;
        }
        return sum;
    }
}
