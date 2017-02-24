package com.theah64.jsamples._20_mouse;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by theapache64 on 24/2/17.
 */
public class MouseXY extends Applet implements MouseMotionListener, MouseListener {

    private int x, y;
    private String status;

    @Override
    public void init() {
        super.init();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Dragged";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Moved";
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Clicked";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Released";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        status = "Mouse Exited";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("monospaced", Font.BOLD, 20));
        g.fillOval(x, y, 10, 10);
        g.drawString(x + "," + y, x + 10, y + 10);
        g.drawString(status, x + 10, y + 20);
        showStatus(status + " at " + x + "," + y);
    }
}
