package com.company;

import com.company.figures.Arc;
import com.company.figures.Ellipse;
import com.company.figures.Line;
import com.company.figures.Rect;
import com.company.figures_drawers.ArcDrawer;
import com.company.figures_drawers.EllipseDrawer;
import com.company.figures_drawers.LineDrawer;
import com.company.figures_drawers.RectDrawer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Валерий on 14.03.2017.
 */
public class MyFrame extends JFrame {

    //Graphics g;
    MyPanel myPanel;

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
        this.add(box, BorderLayout.NORTH);

        arcButn.addActionListener(e -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));
                    int firstArc = myPanel.getTextFieldValue(4);
                    int lastArc = myPanel.getTextFieldValue(5);

                    myComponent.addFigureDrawer(new ArcDrawer(new Arc(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY()), firstArc, lastArc)));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "X:", "Y:", "Начальный угол:", "Конечный угол:");

            this.add(myPanel);
            repainting();
        });

        circleButn.addActionListener(e -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));

                    myComponent.addFigureDrawer(new EllipseDrawer(new Ellipse(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getX()))));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "X:", "Y:");

            this.add(myPanel);
            repainting();
        });

        ellipseButn.addActionListener(e -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));

                    myComponent.addFigureDrawer(new EllipseDrawer(new Ellipse(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY()))));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "X:", "Y:");
            this.add(myPanel);
            repainting();
        });

        lineButn.addActionListener((ActionEvent e) -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    com.company.figures.Point p2 = new com.company.figures.Point(myPanel.getTextFieldValue(2), myPanel.getTextFieldValue(3));

                    myComponent.addFigureDrawer(new LineDrawer(new Line(new com.company.figures.Point(p1.getX(), p1.getY()), new com.company.figures.Point(p2.getX(), p2.getY()))));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "X:", "Y:");
            this.add(myPanel);
            repainting();
        });

        rectButn.addActionListener(e -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    int height = myPanel.getTextFieldValue(2);
                    int width = myPanel.getTextFieldValue(3);

                    myComponent.addFigureDrawer(new RectDrawer(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), width, height)));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "Ширина:", "Высота:");
            this.add(myPanel);
            repainting();
        });

        squareButn.addActionListener(e -> {
            if (myPanel != null) {
                this.remove(myPanel);
            }
            myPanel = new MyPanel(e1 -> {
                if (checkAllFields(myPanel)) {
                    com.company.figures.Point p1 = new com.company.figures.Point(myPanel.getTextFieldValue(0), myPanel.getTextFieldValue(1));
                    int side = myPanel.getTextFieldValue(2);

                    myComponent.addFigureDrawer(new RectDrawer(new Rect(new com.company.figures.Point(p1.getX(), p1.getY()), side, side)));

                    this.remove(myPanel);
                    repainting();
                }
            }, "X:", "Y:", "Сторона:");
            this.add(myPanel);
            repainting();
        });
    }

    public boolean checkAllFields(MyPanel myPanel) {
        if (myPanel.checkFields()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this,
                    "Some of fields is empty",
                    "Empty fields",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void repainting() {
        this.revalidate();
        this.repaint();
    }
}
