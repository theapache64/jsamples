package com.theah64.jsamples._11_student;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Result extends Student {

    int[] marks = new int[5];
    int total = 0;
    double avg;
    String grade;

    @Override
    public void read() {
        super.read();

        //reading marks
        System.out.println("Enter marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        avg = total / 5;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80 && avg < 90) {
            grade = "B";
        } else if (avg >= 65 && avg < 80) {
            grade = "C";
        } else if (avg >= 50 && avg < 65) {
            grade = "D";
        } else if (avg >= 40 && avg < 50) {
            grade = "E";
        } else {
            grade = "FAILED";
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("---------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mark " + i + ": " + marks[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade : " + grade);
        System.out.println("---------------------------");
    }
}
