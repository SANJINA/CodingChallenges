package assignment.Day7;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        //static array to hold the grades of five students.
        int[] grades = new int[5];

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the grades: ");
        for(int i = 0; i < grades.length; i++){
            grades[i] = s.nextInt();
        }
        System.out.println("Grades array: " + java.util.Arrays.toString(grades));
        s.close();

        float avgGrade = getAverageGrade(grades);
        System.out.println("Avg grade: " + avgGrade);
        System.out.println("Grade received: " + getGradeLetter(avgGrade));
        System.out.println("You: " + isPassing(avgGrade));

    }

    public static float getAverageGrade(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++) sum += array[i];
        return (float) sum /array.length;
    }

    public static char getGradeLetter(float avgGrade){
        if(avgGrade >= 90 ) {
            return 'A';
        } else if(avgGrade >= 80 && avgGrade <90) return 'B';
        else if(avgGrade >= 70 && avgGrade <80) return 'C';
        else if(avgGrade >= 60 && avgGrade <=70) return 'D';
        else return 'E';
    }

    public static boolean isPassing(float avgGrade){
        boolean isPass = false;
        if(avgGrade >= 60) isPass = true;
        return isPass;
    }
}
