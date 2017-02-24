package com.theah64.jsamples._4_triangle;

import java.util.Scanner;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of triangle");

        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {

            System.out.println("Triangle can form");
            if ((a == b) && (b == c) && (a == c)) {
                System.out.println("Triangle is equalateral");
            }

            if ((a == b) && (a != c) || (a == c) && (a != b) || (b == c) && (b != a)) {
                System.out.println("Trainle is isosceles");
            }

            if ((a != b) && (a != c) && (b != c)) {
                System.out.println("Triangle is scalene");
            }
            double e = (a + b + c) / 2;
            double area = Math.sqrt(e * (e - a) * (e - b) * (e - c));
            System.out.println("Area of the triangle : " + area);


        } else {
            System.out.println("Triangle cannot form");
        }

    }
}
