package com.company.figures;

import java.awt.*;

/**
 * Created by Валерий on 28.02.2017.
 */
public final class Arc extends TwoDots {

    private int startAngle;
    private int lastAngle;

    public Arc(Point firstPoint, Point lastPoint, int startAngle, int lastAngle) {
        super(firstPoint, lastPoint);
        this.startAngle = startAngle;
        this.lastAngle = lastAngle;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getLastAngle() {
        return lastAngle;
    }

    public void setLastAngle(int lastAngle) {
        this.lastAngle = lastAngle;
    }

    @Override
    public void draw(Graphics g) {
        g.drawArc(getFirstPoint().getX(), getFirstPoint().getY(), getLastPoint().getX(), getLastPoint().getY(), startAngle, lastAngle);
    }
}
