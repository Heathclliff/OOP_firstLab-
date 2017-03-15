package com.company.figures_drawers;

import com.company.figures.Figure;
import com.company.figures.Line;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class LineDrawer implements FigureDrawer {

    @Override
    public void draw(Graphics g, Figure figure) {
        Line line = (Line) figure;
        g.drawLine(line.getFirstPoint().getX(), line.getFirstPoint().getY(), line.getLastPoint().getX(), line.getLastPoint().getY());

    }
}
