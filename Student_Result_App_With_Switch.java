package com.basic.corejava;

import java.util.Scanner;

class StudentInformation {

    String std_name;
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

    // Admission options using SWITCH CASE
    public void admissionOptions() {

        // Parent condition
        if (overall_percentage >= 40) {

            System.out.println("\nStudent is eligible to apply for Engineering.");

            // SWITCH CASE
            switch (course_choice) {

                case 1:

                    System.out.println("Course : BE Computer Science");

                    // Nested IF
                    if (overall_percentage >= 75 && pcm_marks >= 75) {

                        System.out.println("Admission : ELIGIBLE");

                    }
                    else {

                        System.out.println("Admission : NOT ELIGIBLE");
                        System.out.println(
                            "Required : 75% Overall and 75% PCM"
                        );
                    }

                    break;


                case 2:

                    System.out.println("Course : BE Information Technology");

                    // Nested IF
                    if (overall_percentage >= 80 && pcm_marks >= 80) {

                        System.out.println("Admission : ELIGIBLE");

                    }
                    else {

                        System.out.println("Admission : NOT ELIGIBLE");
                        System.out.println(
                            "Required : 80% Overall and 80% PCM"
                        );
                    }

                    break;


                case 3:

                    System.out.println("Course : BE Automobile Engineering");

                    // Nested IF
                    if (overall_percentage >= 90 && pcm_marks >= 90) {

                        System.out.println("Admission : ELIGIBLE");

                    }
                    else {

                        System.out.println("Admission : NOT ELIGIBLE");
                        System.out.println(
                            "Required : 90% Overall and 90% PCM"
                        );
                    }

                    break;


                case 4:

                    System.out.println("Course : BE Mechanical Engineering");

                    // Nested IF
                    if (overall_percentage >= 70 && pcm_marks >= 70) {

                        System.out.println("Admission : ELIGIBLE");

                    }
                    else {

                        System.out.println("Admission : NOT ELIGIBLE");
                        System.out.println(
                            "Required : 70% Overall and 70% PCM"
                        );
                    }

                    break;


                default:

                    System.out.println("Invalid Course Choice");

            }

        }
        else {

            System.out.println(
                "Student is NOT eligible for Engineering."
            );

        }
    }
}


public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("   ENGINEERING ADMISSION SYSTEM");
        
}
