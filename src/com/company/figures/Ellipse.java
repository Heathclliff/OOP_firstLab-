package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public class Ellipse extends Figure {

    private Point rightPoint;

    public Ellipse(Point firstPoint, Point rightPoint) {
        super(firstPoint);
        this.setRightPoint(rightPoint);
    }

    public Point getRightPoint() {

        return rightPoint;
    }

    public void setRightPoint(Point rightPoint) {
        this.rightPoint = rightPoint;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getBorderColor());
        g.drawOval(getFirstPoint().getX(), getFirstPoint().getY(), getRightPoint().getX(), getRightPoint().getY());
    }

}
