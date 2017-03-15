package com.company.figuresDrawers;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class ArcDrawer {
    public void draw(Graphics g, com.company.figures.Point firstPoint, com.company.figures.Point secondPoint, int fArc, int LArct) {
        g.drawArc(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY(), fArc, LArct);
    }
}
