package com.company;

import com.company.figures.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Валерий on 14.03.2017.
 */
public class MyFrame extends JFrame {

    private MyComponent myComponent;

    public void initialization() {

        this.setVisible(true);
        this.setSize(430, 430);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.blue);

        MyComponent myComponent = new MyComponent();
        this.add(myComponent);

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

            MyPanel myPanel = new MyPanel("X:", "Y:", "X:", "Y:", "Начальный угол:", "Конечный угол:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));
                    int firstArc = myPanel.getTextFieldValue(4);
                    int lastArc = myPanel.getTextFieldValue(5);

                    myComponent.addFigure(new Arc(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY()), firstArc, lastArc));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        circleButn.addActionListener(e -> {
            MyPanel myPanel = new MyPanel("X:", "Y:", "X:", "Y:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));

                    myComponent.addFigure(new Circle(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        ellipseButn.addActionListener(e -> {
            MyPanel myPanel = new MyPanel("X:", "Y:", "X:", "Y:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));

                    myComponent.addFigure(new Ellipse(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        lineButn.addActionListener((ActionEvent e) -> {
            MyPanel myPanel = new MyPanel("X:", "Y:", "X:", "Y:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));
                    myComponent.addFigure(new Line(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        rectButn.addActionListener(e -> {
            MyPanel myPanel = new MyPanel("X:", "Y:", "Ширина:", "Высота:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    int height = myPanel.getTextFieldValue(2);
                    int width = myPanel.getTextFieldValue(3);
                    myComponent.addFigure(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), width, height));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        squareButn.addActionListener(e -> {
            MyPanel myPanel = new MyPanel("X:", "Y:", "Сторона:");

            addJButton(myPanel, (ActionEvent q) -> {
                if (myPanel.checkFields()) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    int side = myPanel.getTextFieldValue(2);
                    myComponent.addFigure(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), side, side));
                    this.remove(myPanel);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Some of fields is empty",
                            "Empty fields",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        });

        this.add(box, BorderLayout.NORTH);
    }


    private void addJButton(MyPanel myPanel, ActionListener actionListener) {

        JButton button = new JButton("Нарисовать");
        button.addActionListener(actionListener);

        myPanel.add(button);
        this.add(myPanel);
        this.revalidate();
        this.repaint();
    }
}
