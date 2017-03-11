package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setBackground(Color.blue);
        mainFrame.add(new MyComponent());
    }
}