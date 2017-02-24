package com.theah64.jsamples._9_complex;

import com.theah64.jsamples._14_even_odd_thread.EvenOddGen;
import com.theah64.jsamples._14_even_odd_thread.EvenThread;
import com.theah64.jsamples._14_even_odd_thread.OddThread;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Complex {
    double real, img;

    public Complex() {

    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;

        System.out.println("Complex : " + real + "+" + img + "i");
    }


    public Complex add(Complex c) {
        final Complex nc = new Complex();
        nc.real = this.real + c.real;
        nc.img = this.img + c.img;
        return nc;
    }

    public static void main(String[] args) {
        final Complex c1 = new Complex(1.2, 0.6);
        final Complex c2 = new Complex(1, 0.2);
        final Complex c3 = c1.add(c2);
        System.out.println("Sum is :" + c3.real + "+" + c3.img + "i");
    }
}
