package com.theah64.jsamples._17;


import java.applet.Applet;
import java.awt.*;

/*
<applet code="Rectangle.class" width="300" height="300">
    <param name="x" value="10">
    <param name="y" value="10">
    <param name="width" value="100">
    <param name="height" value="100">
    <param name="r" value="120">
    <param name="g" value="100">
    <param name="b" value="200">
</applet>
 */
public class Rectangle extends Applet {

    @Override
    public void paint(Graphics g) {
        final int x = Integer.parseInt(getParameter("x"));
        final int y = Integer.parseInt(getParameter("y"));
        final int height = Integer.parseInt(getParameter("height"));
        final int width = Integer.parseInt(getParameter("width"));
        final int r = Integer.parseInt(getParameter("r"));
        final int gr = Integer.parseInt(getParameter("g"));
        final int b = Integer.parseInt(getParameter("b"));

        final Color color = new Color(r, gr, b);
        g.setColor(color);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
    }
}
