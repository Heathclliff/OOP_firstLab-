package com.company.figures_drawers;

import com.company.figures.Ellipse;
import com.company.figures.Figure;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class EllipseDrawer implements FigureDrawer {

    @Override
    public void draw(Graphics g, Figure figure) {
        Ellipse ellipse = (Ellipse) figure;
        g.drawOval(ellipse.getFirstPoint().getX(), ellipse.getFirstPoint().getY(), ellipse.getLastPoint().getX(), ellipse.getLastPoint().getY());
    }
}
