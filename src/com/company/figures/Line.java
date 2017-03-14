package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public class Line extends TwoDots {

    public Line(Point fistPoint, Point lastPoint) {
        super(fistPoint, lastPoint);
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(getFirstPoint().getX(), getFirstPoint().getY(), getLastPoint().getX(), getLastPoint().getY());
    }
}
