package assignment.week3.Day1;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8, 9};

        boolean sorted = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                sorted = false;}
        }

        System.out.println("Array is sorted in ascending order: " + String.valueOf(sorted));
    }
}
