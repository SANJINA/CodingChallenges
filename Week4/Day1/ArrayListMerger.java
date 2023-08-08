package assignment.week4.day1.Homework;

import java.util.ArrayList;

public class ArrayListMerger {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        ArrayList<Integer> mergedList = mergeLists(firstList, secondList);
        System.out.println(firstList + " Merged to "+ secondList + " = " + mergedList);
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> mergedList = new ArrayList<>();
        for(Integer n : list1){
            mergedList.add(n);
        }

        for(Integer n : list2 ){
            mergedList.add(n);
        }
        return mergedList;
    }
}
