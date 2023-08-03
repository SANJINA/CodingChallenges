package assignment.Day7;

public class ArraySumAverage {
    public static void main(String[] args) {
        //take input as array of integers
        int[] number = {1,2,3,4,5,6};
        //refactor input from the user

        //Calculate the sum and average
        int countNum = 0;
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            countNum ++;
            sum = sum + number[i];
        }

        //calculate average
        float avg = sum / countNum;

        System.out.println("Sum = " + sum + " And average = " + avg);

    }
}
