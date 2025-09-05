package com.rashid;

import com.rashid.Student ;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        App app = new App();
        app.questioner();

    }
    public void questioner() {
        Scanner sc = new Scanner(System.in);

        // Step 3: Ask for the number of students
        System.out.println("Please enter the number of students in the group and press [ENTER]:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Step 4: Create a collection of students
        Student[] students = new Student[size];

        // Step 5 & 6: Loop to enter student names
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the name of student #" + (i + 1) + " and press [ENTER]:");
            String name = sc.nextLine();
            students[i] = new Student(name); // Step 6: Store as new object
        }

        // Step 7: Write back the list of students
        System.out.println("\nList of students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + ": " + students[i].getName());
        }

        // Step 8: Loop to register attendance
        System.out.println("\nAttendance Registration:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Is student #" + (i + 1) + " (" + students[i].getName() + ") present? [Y/N + ENTER]: ");
            String response = sc.nextLine().trim().toUpperCase();
            students[i].setAbsent(response.equals("Y"));
        }

        // Step 9: Write back the list with attendance status
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + ": " + students[i]);
        }
    }
//    public void questioner(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the course name: ");
//        String courseName = sc.nextLine();
//
//        System.out.print("Enter the students number: ");
//        int studentsNumber = sc.nextInt();
//        sc.nextLine(); // Consume leftover newline
//
//        String[] studentNames = new String[studentsNumber];
//        int[] studentGrades = new int[studentsNumber];
//
//        for (int i = 0; i < studentsNumber; i++) {
//            System.out.print("Enter student name: ");
//            studentNames[i] = sc.nextLine();
//        }
//
//        for(int i = 0; i < studentsNumber; i++){
//            System.out.print("Enter the grade of student " + studentNames[i] + ": ");
//            studentGrades[i] = sc.nextInt();
//            sc.nextLine(); // Consume leftover newline
//        }
//
//        int maxGrade = Integer.MIN_VALUE;
//        int index = 0;
//        for(int i = 0; i < studentsNumber; i++){
//            if(studentGrades[i] > maxGrade){
//                maxGrade = studentGrades[i];
//                index = i;
//            }
//        }
//
//        System.out.println();
//
//        int averageGrade = Arrays.stream(studentGrades).sum() / studentsNumber;
//        System.out.println("The average grade is: " + averageGrade);
//
//        System.out.println("Student " + studentNames[index] + " has maximum grade: " + maxGrade);
//    }
}
