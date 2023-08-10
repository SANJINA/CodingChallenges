package assignment.week3.Day5;
import java.util.Arrays;

public class ArrayChecker {

    public static void main(String[] args) {
        //anonymous array initialization
        int[] numbers1 = new int[]{6,6,2};
        int[] numbers2 = new int[]{6,6,2,6};
        int[] numbers3 = new int[]{6,7,2,6};

        int countSix1 = array667(numbers1);
        int countSix2 = array667(numbers2);
        int countSix3 = array667(numbers3);

        System.out.println("array667( " + java.util.Arrays.toString(numbers1) + " ) -> " + countSix1);
        System.out.println("array667( " + java.util.Arrays.toString(numbers2) + " ) -> " + countSix2);
        System.out.println("array667( " + java.util.Arrays.toString(numbers3) + " ) -> " + countSix3);

    }

    public static int array667(int[] array){
        int countOfTwo6 = 0;
        for(int i = 0; i < array.length - 1 ; i++){
            if((array[i] == array[i+1] && array[i]==6) || (array[i]==6 && array[i+1]==7) ){
                countOfTwo6++;
            }
        }
        return countOfTwo6;
    }

}
