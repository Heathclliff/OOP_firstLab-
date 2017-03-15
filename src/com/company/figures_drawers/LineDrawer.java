package com.company.figures_drawers;

import com.company.figures.Line;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class LineDrawer implements FigureDrawer {

    private Line line;

    public LineDrawer(Line line) {
        this.line = line;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(line.getFirstPoint().getX(), line.getFirstPoint().getY(), line.getLastPoint().getX(), line.getLastPoint().getY());
    }
}
