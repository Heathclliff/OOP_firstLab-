package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setBackground(Color.blue);
        mainFrame.add(new MyComponent());

        Box box = Box.createHorizontalBox();
        JButton arcButn = new JButton("Arc");
        JButton circleButn = new JButton("Circle");
        JButton ellipseButn = new JButton("Ellipse");
        JButton lineButn = new JButton("Line");
        JButton rectButn = new JButton("Rectangle");
        JButton squareButn = new JButton("Square");
        box.add(arcButn);
        box.add(circleButn);
        box.add(ellipseButn);
        box.add(lineButn);
        box.add(rectButn);
        box.add(squareButn);

        arcButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        circleButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ellipseButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        lineButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        rectButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        squareButn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mainFrame.add(box, BorderLayout.SOUTH);
    }
}