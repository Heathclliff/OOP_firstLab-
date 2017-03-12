package com.company;

import com.company.figures.Line;

import javax.swing.*;
import java.awt.*;
public class Main {
    static int x = 10;

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setSize(430, 430);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setBackground(Color.blue);

        MyComponent myComponent = new MyComponent();
        mainFrame.add(myComponent);

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


        arcButn.addActionListener(e -> {

        });

        circleButn.addActionListener(e -> {

        });

        ellipseButn.addActionListener(e -> {

        });

        lineButn.addActionListener(e -> {

            myComponent.addFigure(new Line(new com.company.figures.Point(x, 1), new com.company.figures.Point(30, 30)));
            mainFrame.revalidate();
            mainFrame.repaint();
            x += 10;
        });

        rectButn.addActionListener(e -> {

        });

        squareButn.addActionListener(e -> {

        });

        mainFrame.add(box, BorderLayout.NORTH);
    }
}