package com.theah64.jsamples._18;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListBox extends Applet implements ActionListener {

    private List list;
    private TextField input;

    @Override
    public void init() {
        setSize(300, 300);
        final Label label = new Label("Enter item to add");
        add(label);
        input = new TextField(20);
        add(input);
        final Button bAdd = new Button("Add");
        add(bAdd);
        final Button bDelete = new Button("Delete");
        add(bDelete);
        list = new List();
        add(list);
        bAdd.addActionListener(this);
        bDelete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Add":
                list.add(input.getText());
                input.setText("");
                break;
            case "Delete":
                list.remove(list.getSelectedItem());
                break;
        }
    }
}
