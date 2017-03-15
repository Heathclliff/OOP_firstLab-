package com.company.figures;

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

    public int getWight() {

        return width;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}