package assignment.week3.Day1;

public class ReverseArrayPrinter {
    public static void main(String[] args) {

        int[] array = {5,6,7,8};

        int[] arrayReversed = new int[array.length];

        int count = 0;
        for(int i = array.length - 1; i >= 0; i--){
            arrayReversed[count] = array[i];
            count++;
        }

        System.out.println( "Given array: " + java.util.Arrays.toString(array) + " and its reversed version is: " + java.util.Arrays.toString(arrayReversed));
    }
}
