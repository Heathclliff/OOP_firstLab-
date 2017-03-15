package com.company.figures;

/**
 * Created by Валерий on 28.02.2017.
 */
public final class Square extends Rect {

    public Square(Point leftPoint, int width_height) {

        super(leftPoint, width_height, width_height);
    }

    @Override
    public int getWidth() {
        return getHeight();
    }

    @Override
    public void setWidth(int width) {
        this.setHeight(width);
    }
}
