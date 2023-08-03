package assignment1.Day2;


public class StudentGrade {
    public static void main(String[] args) {
        int gradeStudent1 = 8;
        int gradeStudent2 = 9;
        int gradeStudent3 = 5;
        int gradeStudent4 = 4;
        int gradeStudent5 = 8;

        //calculate average
        float totalGrades = gradeStudent1 + gradeStudent2 + gradeStudent3 +gradeStudent4 + gradeStudent5;
        int countOfStudents = 5;

        float avg = totalGrades/ countOfStudents;

        System.out.println("Average grade is: " + avg);

    }
}
