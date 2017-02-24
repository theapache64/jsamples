package com.theah64.jsamples._16_override;

import java.util.Scanner;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Greatest3 extends Greatest2 {
    @Override
    public void getGreatest() {
        super.getGreatest();

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        int g;
        if (a > b && a > c) {
            g = a;
        } else if (b > a && b > c) {
            g = b;
        } else {
            g = c;
        }
        System.out.println("Greatest is :" + g);


    }
}
