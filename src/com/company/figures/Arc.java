package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public final class Arc extends Figure {

    private Point lastPoint;
    private int startAngle;
    private int lastAngle;

    public Arc(Point firstPoint, Point rightPoint, int startAngle, int lastAngle) {
        super(firstPoint);
        this.lastPoint = rightPoint;
        this.startAngle = startAngle;
        this.lastAngle = lastAngle;
    }

    @Override
    public void draw(Graphics g) {
        g.drawArc(getFirstPoint().getX(), getFirstPoint().getY(), lastPoint.getX(), lastPoint.getY(), startAngle, lastAngle);
    }
}
