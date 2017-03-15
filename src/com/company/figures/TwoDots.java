package com.company.figures;

/**
 * Created by Валерий on 14.03.2017.
 */
abstract public class TwoDots extends Figure {

    private Point lastPoint;

    public TwoDots(Point fistPoint, Point lastPoint) {
        super(fistPoint);
        this.lastPoint = lastPoint;
    }

    public Point getLastPoint() {
        return lastPoint;
    }

    public void setLastPoint(Point lastPoint) {
        this.lastPoint = lastPoint;
    }
}
