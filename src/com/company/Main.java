package com.company;

import com.company.figures.Line;
import com.company.figures.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

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

        lineButn.addActionListener((ActionEvent e) -> {
            JPanel panel = new JPanel();
            JLabel labelX1 = new JLabel("X:");
            JTextField textFieldX1 = new JTextField(16);
            JLabel labelY1 = new JLabel("Y:");
            JTextField textFieldY1 = new JTextField(16);

            JLabel labelX2 = new JLabel("X:");
            JTextField textFieldX2 = new JTextField(16);
            JLabel labelY2 = new JLabel("Y:");
            JTextField textFieldY2 = new JTextField(16);

            panel.add(labelX1);
            panel.add(textFieldX1);
            panel.add(labelY1);
            panel.add(textFieldY1);
            panel.add(labelX2);
            panel.add(textFieldX2);
            panel.add(labelY2);
            panel.add(textFieldY2);
            JButton button = new JButton("Нарисовать");
            button.addActionListener((ActionEvent q) -> {
                try {
                    com.company.figures.Point p1 = new Point(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldX1.getText()));
                    com.company.figures.Point p2 = new Point(Integer.parseInt(textFieldX2.getText()), Integer.parseInt(textFieldX2.getText()));
                    myComponent.addFigure(new Line(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });

        rectButn.addActionListener(e -> {
            JPanel panel = new JPanel();
            JLabel labelX1 = new JLabel("X:");
            JTextField textFieldX1 = new JTextField(16);
            JLabel labelY1 = new JLabel("Y:");
            JTextField textFieldY1 = new JTextField(16);

            JLabel labelX2 = new JLabel("X:");
            JTextField textFieldX2 = new JTextField(16);
            JLabel labelY2 = new JLabel("Y:");
            JTextField textFieldY2 = new JTextField(16);

            panel.add(labelX1);
            panel.add(textFieldX1);
            panel.add(labelY1);
            panel.add(textFieldY1);
            panel.add(labelX2);
            panel.add(textFieldX2);
            panel.add(labelY2);
            panel.add(textFieldY2);
            JButton button = new JButton("Нарисовать");
            button.addActionListener((ActionEvent q) -> {
                try {
                    com.company.figures.Point p1 = new Point(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldX1.getText()));
                    com.company.figures.Point p2 = new Point(Integer.parseInt(textFieldX2.getText()), Integer.parseInt(textFieldX2.getText()));
                    myComponent.addFigure(new Line(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });

        squareButn.addActionListener(e -> {

        });

        mainFrame.add(box, BorderLayout.NORTH);
    }
}