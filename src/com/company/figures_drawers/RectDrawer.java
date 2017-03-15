package com.company.figures_drawers;

import com.company.figures.Rect;

import java.awt.*;

/**
 * Created by Валерий on 15.03.2017.
 */
public class RectDrawer implements FigureDrawer {

    private Rect rect;

    public RectDrawer(Rect rect) {
        this.rect = rect;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(rect.getFirstPoint().getX(), rect.getFirstPoint().getY(), rect.getHeight(), rect.getWidth());
    }
}
