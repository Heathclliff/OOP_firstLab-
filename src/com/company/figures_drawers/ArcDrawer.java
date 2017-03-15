package com.company.figures_drawers;

import com.company.figures.Arc;
import com.company.figures.Figure;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class ArcDrawer implements FigureDrawer {
    @Override
    public void draw(Graphics g, Figure figure) {
        Arc arc = (Arc) figure;
        g.drawArc(arc.getFirstPoint().getX(), arc.getFirstPoint().getY(), arc.getLastPoint().getX(), arc.getLastPoint().getY(), arc.getStartAngle(), arc.getLastAngle());
    }
}
