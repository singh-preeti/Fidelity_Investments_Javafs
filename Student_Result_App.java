package com.basic.corejava;

import java.util.Scanner;

class StudentInformation {

    String std_name ;
    int std_id;
    double overall_percentage;
    double pcm_marks;
    int course_choice;

    // Constructor
    StudentInformation(String name, int id,
                       double percentage, double pcm,
                       int course) {

        std_name = name;
        std_id = id;
        overall_percentage = percentage;
        pcm_marks = pcm;
        course_choice = course;
    }

    // IF-ELSE example
    public void studentResult() {

        if (overall_percentage >= 40) {
            System.out.println("Result : PASS");
        } 
        else {
            System.out.println("Result : FAIL");
        }
    }

    // Admission options
    public void admissionOptions() {

        // Parent condition
        if (overall_percentage >= 40) {

            System.out.println("\n Student is eligible to apply for Engineering.");

            // ELSE-IF LADDER
            if (course_choice == 1) {

                // NESTED IF
                if (overall_percentage >= 75 && pcm_marks >= 75) {
                    System.out.println("Course : BE Computer Science");
                    System.out.println("Admission : ELIGIBLE");
                } 
                else {
                    System.out.println("BE CS : NOT ELIGIBLE");
                    System.out.println("Required : 75% Overall and 75% PCM");
                }

            } 
            else if (course_choice == 2) {

                if (overall_percentage >= 80 && pcm_marks >= 80) {
                    System.out.println("Course : BE Information Technology");
                    System.out.println("Admission : ELIGIBLE");
                } 
                else {
                    System.out.println("BE IT : NOT ELIGIBLE");
                    System.out.println("Required : 80% Overall and 80% PCM");
                }

            } 
            else if (course_choice == 3) {

                if (overall_percentage >= 90 && pcm_marks >= 90) {
                    System.out.println("Course : BE Automobile Engineering");
                    System.out.println("Admission : ELIGIBLE");
                } 
                else {
                    System.out.println("BE Automobile : NOT ELIGIBLE");
                    System.out.println("Required : 90% Overall and 90% PCM");
                }

            } 
            else if (course_choice == 4) {

                if (overall_percentage >= 70 && pcm_marks >= 70) {
                    System.out.println("Course : BE Mechanical Engineering");
                    System.out.println("Admission : ELIGIBLE");
                } 
                else {
                    System.out.println("BE Mechanical : NOT ELIGIBLE");
                    System.out.println("Required : 70% Overall and 70% PCM");
                }

            } 
            else {

                System.out.println("Invalid Course Choice");

            }

        } 
        else {

            System.out.println("Student is NOT eligible for Engineering.");

        }
    }
}


public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.println("====== ENGINEERING ADMISSION SYSTEM ======");
       

        // Accept student information
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        System.out.print("Enter Overall Percentage : ");
        double percentage = sc.nextDouble();

        System.out.print("Enter PCM Percentage : ");
        double pcm = sc.nextDouble();

        // Display courses
        System.out.println("\nAvailable Courses");
        System.out.println("1. BE Computer Science");
        System.out.println("2. BE Information Technology");
        System.out.println("3. BE Automobile Engineering");
        System.out.println("4. BE Mechanical Engineering");

        System.out.print("\nSelect Course : ");
        int course = sc.nextInt();

        // Create object
        StudentInformation stud_inf =
                new StudentInformation(name, id, percentage, pcm, course);

        System.out.println("\n STUDENT RESULT ");

        // IF-ELSE example
        stud_inf.studentResult();

        System.out.println("\n ADMISSION RESULT ");

        // Nested IF + ELSE-IF ladder
        stud_inf.admissionOptions();

        sc.close();
    }
}
