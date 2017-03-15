package com.company.figures;

/**
 * Created by Валерий on 28.02.2017.
 */
public final class Circle extends Ellipse {

    public Circle(Point Center, Point radius) {

        super(Center, radius);
        radius.setX(radius.getY());
    }

}
