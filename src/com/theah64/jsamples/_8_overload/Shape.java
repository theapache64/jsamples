package com.theah64.jsamples._8_overload;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Shape {
    public void volume(int l, int b, int h) {
        System.out.println("Volume of the box is " + (l * b * h));
    }

    public void volume(int r) {
        System.out.println("Volume of the cube is " + (r * r * r));
    }

    public void volume(int r, int h) {
        System.out.println("Volume of the cylnder is " + (3.14 * r * r * h));
    }

    public static void main(String[] args) {
        final Shape shape = new Shape();
        shape.volume(3);
        shape.volume(1, 2);
        shape.volume(1, 2, 3);
    }

}
