package assignment.week4.day1.Homework.ManageStudent;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anna", 20 , 80.05));
        studentList.add(new Student("Mira", 21, 90.58));
        studentList.add(new Student("Jasper", 19, 91.48));

        //avg grade of all students
        System.out.println("Average grade of all student: " + getAverageGrade(studentList));

        //print students with grade > 90
        printStudents(studentList, 90);
    }

    private static double getAverageGrade(ArrayList<Student> list){
        double avgGrade, total = 0.0;
        for(Student s : list){
            total += s.getGrade();
        }
        avgGrade = total/list.size();
        return avgGrade;
    }

    private static void printStudents(ArrayList<Student> list, double targetGrade){
        System.out.println("List of students with grade greater than " + targetGrade + " :");
        for(Student s : list){
            if(s.getGrade() > targetGrade){
                System.out.println("Name: " + s.getName() + " of age: "+ s.getAge());
            }
        }
    }
}
