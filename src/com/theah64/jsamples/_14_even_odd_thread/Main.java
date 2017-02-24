package com.theah64.jsamples._14_even_odd_thread;

import com.theah64.jsamples._16_override.Greatest3;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Main {
    public static void main(String[] args) {
        EvenOddGen gen = new EvenOddGen();
        OddThread ot = new OddThread(gen);
        EvenThread et = new EvenThread(gen);
        ot.start();
        et.start();
    }
}
