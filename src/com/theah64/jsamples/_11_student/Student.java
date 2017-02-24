package com.theah64.jsamples._11_student;

import java.util.Scanner;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Student {
    final Scanner scanner = new Scanner(System.in);
    int rollNumber;
    String name;

    public void read() {
        System.out.println("Enter the roll number:");
        rollNumber = scanner.nextInt();
        System.out.println("Enter the name: ");
        name = scanner.next();
    }

    public void display() {
        System.out.println("------------------");
        System.out.println("RollNo: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("------------------");
    }
}
