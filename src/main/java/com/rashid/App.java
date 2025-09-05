package com.rashid;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

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

    public void questioner(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter the students number: ");
        int studentsNumber = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String[] studentNames = new String[studentsNumber];
        int[] studentGrades = new int[studentsNumber];

        for (int i = 0; i < studentsNumber; i++) {
            System.out.print("Enter student name: ");
            studentNames[i] = sc.nextLine();
        }

        for(int i = 0; i < studentsNumber; i++){
            System.out.print("Enter the grade of student " + studentNames[i] + ": ");
            studentGrades[i] = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
        }

        int maxGrade = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < studentsNumber; i++){
            if(studentGrades[i] > maxGrade){
                maxGrade = studentGrades[i];
                index = i;
            }
        }

        System.out.println();

        int averageGrade = Arrays.stream(studentGrades).sum() / studentsNumber;
        System.out.println("The average grade is: " + averageGrade);

        System.out.println("Student " + studentNames[index] + " has maximum grade: " + maxGrade);
    }
}
