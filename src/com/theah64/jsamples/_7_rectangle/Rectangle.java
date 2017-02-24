package com.theah64.jsamples._7_rectangle;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Rectangle {
    private final int a;

    public Rectangle(int l, int b) {
        this.a = l * b;
    }

    public int getArea() {
        return a;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(7, 8);

        if (r1.getArea() > r2.getArea()) {
            System.out.println("r1 is greater than r2");
        } else {
            System.out.println("r2 is greater than r1");
        }
    }
}
