package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public abstract class Figure {

    private Point firstPoint;
    private Color borderColor;

    public Figure(Point firstPoint) {
        this.setFirstPoint(firstPoint);
        this.borderColor = Color.BLACK;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public abstract void draw(Graphics g);
}
