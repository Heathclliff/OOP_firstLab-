package com.company.figures;

/**
 * Created by Валерий on 28.02.2017.
 */
public final class Point {

    private int x, y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
