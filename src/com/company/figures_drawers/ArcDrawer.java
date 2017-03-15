package com.company.figures_drawers;

import com.company.figures.Arc;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class ArcDrawer implements FigureDrawer {

    private Arc arc;

    public ArcDrawer(Arc arc) {
        this.arc = arc;
    }

    @Override
    public void draw(Graphics g) {
        g.drawArc(arc.getFirstPoint().getX(), arc.getFirstPoint().getY(), arc.getLastPoint().getX(), arc.getLastPoint().getY(), arc.getStartAngle(), arc.getLastAngle());
    }
}
