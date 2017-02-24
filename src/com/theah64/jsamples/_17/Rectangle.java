package com.theah64.jsamples._17;


import java.applet.Applet;

public class Rectangle extends Applet {

    @Override
    public void init() {
        System.out.println(getParameter("x"));
    }

}
