package com.company;

import com.company.figures_drawers.FigureDrawer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валерий on 28.02.2017.kl;lk;
 */
public class MyComponent extends JComponent {

    Graphics g;

    private List<FigureDrawer> figureListDrawer = new ArrayList<>();

    public void drawing(Graphics g) {

        for (int i = 0; i < figureListDrawer.size(); i++) {

            figureListDrawer.get(i).draw(g);
        }
    }


    public void addFigureDrawer(FigureDrawer figureDrawer) {

        figureListDrawer.add(figureDrawer);
    }
    @Override
    public void paintComponent(Graphics g) {
        drawing(g);
    }
}