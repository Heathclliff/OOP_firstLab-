package com.company.figuresDrawers;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class EllipseDrawer {
    public void draw(Graphics g, com.company.figures.Point firstPoint, com.company.figures.Point secondPoint) {
        g.drawOval(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
    }
}
