package com.theah64.jsamples._14_even_odd_thread;

/**
 * Created by theapache64 on 24/2/17.
 */
public class EvenOddGen {
    public synchronized void genOdd(int n) {
        System.out.println("OddNumbers: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public synchronized void genEven(int n) {
        System.out.println("EvenNumbers: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }


}
