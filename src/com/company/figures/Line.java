package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public class Line extends Figure {

    private Point lastPoint;


    public Line(Point fistPoint, Point lastPoint) {
        super(fistPoint);
        this.lastPoint = lastPoint;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(getFirstPoint().getX(), getFirstPoint().getY(), lastPoint.getX(), lastPoint.getY());
    }
}
