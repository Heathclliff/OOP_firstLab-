package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public class Rect extends Figure {

    private int width;
    private int height;

    public Rect(Point firstPoint, int width, int height) {
        super(firstPoint);
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {

        g.drawRect(getFirstPoint().getX(), getFirstPoint().getY(), width, height);
    }
}