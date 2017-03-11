package com.company;

import com.company.figures.*;
import com.company.figures.Point;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.kl;lk;
 */
public class MyComponent extends JComponent {

    private Line myLine;
    private Arc myArc;
    private Ellipse myEllipse;
    private Cicle myCicle;
    private Rect myRect;
    private Square mySquare;

    @Override
    public void paintComponent(Graphics g) {
        initialization();
        drawing(g);
    }

    public void initialization() {
        myLine = new Line(new com.company.figures.Point(1, 1), new com.company.figures.Point(30, 30));
        myArc = new Arc(new Point(40, 40), new Point(60, 40), 0, 180);
        myEllipse = new Ellipse(new Point(100, 100), new Point(50, 90));
        myCicle = new Cicle(new Point(200, 200), new Point(50, 50));
        myRect = new Rect(new Point(300, 300), 50, 70);
        mySquare = new Square(new Point(400, 400), 25);
    }

    public void drawing(Graphics g) {
        myLine.draw(g);
        myArc.draw(g);
        myEllipse.draw(g);
        myCicle.draw(g);
        myRect.draw(g);
        mySquare.draw(g);
    }

}