package com.company.figures_drawers;

import com.company.figures.Ellipse;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class EllipseDrawer implements FigureDrawer {

    private Ellipse ellipse;

    public EllipseDrawer(Ellipse ellipse) {
        this.ellipse = ellipse;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(ellipse.getFirstPoint().getX(), ellipse.getFirstPoint().getY(), ellipse.getLastPoint().getX(), ellipse.getLastPoint().getY());
    }
}
