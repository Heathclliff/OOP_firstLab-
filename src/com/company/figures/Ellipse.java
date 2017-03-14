package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public class Ellipse extends TwoDots {

    public Ellipse(Point firstPoint, Point rightPoint) {
        super(firstPoint, rightPoint);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(getFirstPoint().getX(), getFirstPoint().getY(), getLastPoint().getX(), getLastPoint().getY());
    }

}
