package com.theah64.jsamples._19_smiley;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by theapache64 on 24/2/17.
 */
public class Smiley extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, 200, 200);
        g.setColor(Color.WHITE);
        g.fillOval(40, 60, 50, 50);
        g.fillOval(120, 60, 50, 50);
        g.setColor(Color.BLACK);
        g.fillOval(50, 80, 30, 30);
        g.fillOval(130, 80, 30, 30);
        g.drawArc(50, 110, 100, 60, 200, 140);
    }
}
