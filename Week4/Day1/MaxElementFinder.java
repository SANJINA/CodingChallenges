package assignment.week4.day1.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class MaxElementFinder {

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        int maxNum = findMaxNumber(input);
        System.out.println("max element: " + maxNum);
    }

    public static int findMaxNumber(ArrayList<Integer> inputList){
            return Collections.max(inputList);
    }
}
