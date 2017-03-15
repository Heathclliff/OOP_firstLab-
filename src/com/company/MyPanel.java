package com.company;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валерий on 14.03.2017.
 */
public class MyPanel extends JPanel {

    KeyAdapter keyAdapter = new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {

            if (!Character.isDigit(e.getKeyChar())) {
                e.consume();
            }
        }

        ;
    };
    private List<JTextField> jTextFieldList = new ArrayList<>();


    public MyPanel(String... labels) {

        for (int i = 0; i < labels.length; i++) {

            jTextFieldList.add(getTextField(labels[i]));
        }
    }


    public Integer getTextFieldValue(int pos) {

        return Integer.valueOf(jTextFieldList.get(pos).getText().toString());
    }


    private JTextField getTextField(String label) {

        JTextField jTextField = new JTextField(16);
        jTextField.addKeyListener(keyAdapter);

        JLabel jLabel = new JLabel(label);

        this.add(jLabel);
        this.add(jTextField);

        return jTextField;
    }


    public boolean checkFields() {

        boolean value = true;

        for (int i = 0; i < jTextFieldList.size(); i++) {

            value = (value && !(jTextFieldList.get(i).getText().isEmpty()));
        }

        return value;
    }
}