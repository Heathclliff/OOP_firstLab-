package com.company.figuresDrawers;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class RectDrawer {
    public void draw(Graphics g, com.company.figures.Point firstPoint, int height, int width) {
        g.drawRect(firstPoint.getX(), firstPoint.getY(), height, width);
    }
}
