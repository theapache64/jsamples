package com.theah64.jsamples._3_p_a_d;

import java.util.Scanner;

/**
 * Created by theapache64 on 24/2/17.
 */
public class PAD {


    public int num = 0;

    public void getnum()  //method to accept a number from user
    {
        Scanner in = new Scanner(System.in);  //creting an object of Scanner class
        System.out.println("Enter a number");
        num = in.nextInt();
    }

    public void fnchecknumber()  //method to check type of number
    {
        int sum = 0, dnum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                sum += i;
        }
        dnum = 2 * num;
        if (sum < dnum)
            System.out.println("It is a Deficient number");
        else if (sum == dnum)
            System.out.println("It is a Perfect number");
        else if (sum > dnum)
            System.out.println("It is an Abundant number");
    }

    public static void main(String[] args)   //Entry point of program
    {
        PAD ob = new PAD();  //creating object of class checknumber
        ob.getnum();                       //calling method
        ob.fnchecknumber();          //calling method
    }

}
