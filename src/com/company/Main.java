package com.company;

import com.company.figures.*;
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
            JPanel panel = new JPanel();
            JLabel labelX1 = new JLabel("X:");
            JTextField textFieldX1 = new JTextField(16);
            JLabel labelY1 = new JLabel("Y:");
            JTextField textFieldY1 = new JTextField(16);

            JLabel labelX2 = new JLabel("X:");
            JTextField textFieldX2 = new JTextField(16);
            JLabel labelY2 = new JLabel("Y:");
            JTextField textFieldY2 = new JTextField(16);

            JLabel labelFArc = new JLabel("Начальный угол:");
            JTextField textFieldFArc = new JTextField(16);
            JLabel labelLArc = new JLabel("Конечный угол:");
            JTextField textFieldLArc = new JTextField(16);


            panel.add(labelX1);
            panel.add(textFieldX1);
            panel.add(labelY1);
            panel.add(textFieldY1);
            panel.add(labelX2);
            panel.add(textFieldX2);
            panel.add(labelY2);
            panel.add(textFieldY2);
            panel.add(labelFArc);
            panel.add(textFieldFArc);
            panel.add(labelLArc);
            panel.add(textFieldLArc);
            JButton button = new JButton("Нарисовать");
            button.addActionListener((ActionEvent q) -> {
                try {
                    com.company.figures.Point p1 = new Point(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldX1.getText()));
                    com.company.figures.Point p2 = new Point(Integer.parseInt(textFieldX2.getText()), Integer.parseInt(textFieldX2.getText()));
                    int firstArc = Integer.parseInt(textFieldFArc.getText());
                    int lastArc = Integer.parseInt(textFieldLArc.getText());

 /* !!!*/
                    myComponent.addFigure(new Arc(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY()), firstArc, lastArc));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });

        circleButn.addActionListener(e -> {
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
 /* !!!*/
                    myComponent.addFigure(new Cicle(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });

        ellipseButn.addActionListener(e -> {
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
  /* !!!*/
                    myComponent.addFigure(new Ellipse(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
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
   /* !!!*/
                    myComponent.addFigure(new Line(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY())));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });
//ПРИДУМАТЬ!!!!!!!!!!!!!!
        rectButn.addActionListener(e -> {
            JPanel panel = new JPanel();
            JLabel labelX1 = new JLabel("X:");
            JTextField textFieldX1 = new JTextField(16);
            JLabel labelY1 = new JLabel("Y:");
            JTextField textFieldY1 = new JTextField(16);

            JLabel labelX2 = new JLabel("Ширина:");
            JTextField textFieldX2 = new JTextField(16);
            JLabel labelY2 = new JLabel("Высота:");
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
                    int height = Integer.parseInt(textFieldX2.getText());
                    int width = Integer.parseInt(textFieldY2.getText());
                    myComponent.addFigure(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), width, height));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
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
            JPanel panel = new JPanel();
            JLabel labelX1 = new JLabel("X:");
            JTextField textFieldX1 = new JTextField(16);
            JLabel labelY1 = new JLabel("Y:");
            JTextField textFieldY1 = new JTextField(16);

            JLabel labelX2 = new JLabel("Сторона:");
            JTextField textFieldX2 = new JTextField(16);

            panel.add(labelX1);
            panel.add(textFieldX1);
            panel.add(labelY1);
            panel.add(textFieldY1);
            panel.add(labelX2);
            panel.add(textFieldX2);
            JButton button = new JButton("Нарисовать");
            button.addActionListener((ActionEvent q) -> {
                try {
                    com.company.figures.Point p1 = new Point(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldX1.getText()));
                    int side = Integer.parseInt(textFieldX2.getText());
                    myComponent.addFigure(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), side, side));
                } catch (Exception e1) {
                    String message = "Введите,пожалуйста,цифровые значения!";
                    JOptionPane.showMessageDialog(mainFrame, message, "Dialog", JOptionPane.ERROR_MESSAGE);
                } finally {
                    mainFrame.remove(panel);
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            });
            panel.add(button);
            mainFrame.add(panel);
            mainFrame.revalidate();
            mainFrame.repaint();
        });

        mainFrame.add(box, BorderLayout.NORTH);
    }
}