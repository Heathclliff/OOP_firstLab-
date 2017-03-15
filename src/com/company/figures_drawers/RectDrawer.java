package com.company.figures_drawers;

import com.company.figures.Figure;
import com.company.figures.Rect;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class RectDrawer implements FigureDrawer {

    @Override
    public void draw(Graphics g, Figure figure) {
        Rect rect = (Rect) figure;
        g.drawRect(rect.getFirstPoint().getX(), rect.getFirstPoint().getY(), rect.getHeight(), rect.getWidth());
    }
}
