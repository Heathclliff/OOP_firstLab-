package com.company.figuresDrawers;

import com.company.figures.Point;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class LineDrawer extends FigureDrawer {

    public void draw(Graphics g, com.company.figures.Point firstPoint, Point secondPoint) {
        g.drawLine(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
    }
}
