package com.theah64.jsamples._16_override;

import java.util.Scanner;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Greatest2 {
    public void getGreatest() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b");
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        System.out.println("Greatest is " + (a > b ? a : b));
    }
}
