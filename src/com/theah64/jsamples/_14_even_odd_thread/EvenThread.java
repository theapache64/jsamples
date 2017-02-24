package com.theah64.jsamples._14_even_odd_thread;

/**
 * Created by theapache64 on 24/2/17.
 */
public class EvenThread extends Thread {
    private final EvenOddGen numbers;

    public EvenThread(EvenOddGen numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        numbers.genEven(10);
    }
}
