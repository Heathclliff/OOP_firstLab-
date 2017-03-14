package com.company;

import com.company.figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Валерий on 28.02.2017.kl;lk;
 */
public class MyComponent extends JComponent {

    Graphics g;

    /*private Line myLine;
    private Arc myArc;
    private Ellipse myEllipse;
    private Cicle myCicle;
    private Rect myRect;
    private Square mySquare;
*/
    private ArrayList<Figure> figureList = new ArrayList<>();

    @Override
    public void paintComponent(Graphics g) {

        //initialization(g);
        drawing(g);
    }

    public void initialization(Graphics g) {

        this.g = g;

        /*myLine = new Line(new com.company.figures.Point(1, 1), new com.company.figures.Point(30, 30));
        myArc = new Arc(new Point(40, 40), new Point(60, 40), 0, 180);
        myEllipse = new Ellipse(new Point(100, 100), new Point(50, 90));
        myCicle = new Cicle(new Point(200, 200), new Point(50, 50));
        myRect = new Rect(new Point(300, 300), 50, 70);
        mySquare = new Square(new Point(400, 400), 25);*/
    }

    public void drawing(Graphics g) {

        for (int i = 0; i < figureList.size(); i++) {

            figureList.get(i).draw(g);
        }
    }


    public void addFigure(Figure figure) {

        figureList.add(figure);
    }
}