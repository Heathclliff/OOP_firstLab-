package com.company;

import com.company.figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Валерий on 28.02.2017.kl;lk;
 */
public class MyComponent extends JComponent {

    Graphics g;

    private ArrayList<Figure> figureList = new ArrayList<>();

    @Override
    public void paintComponent(Graphics g) {
        drawing(g);
    }

    public void drawing(Graphics g) {

        for (int i = 0; i < figureList.size(); i++) {

            figureList.get(i).draw(g);
        }
    }


    public void addFigure(Figure figure) {

        figureList.add(figure);
    }
}