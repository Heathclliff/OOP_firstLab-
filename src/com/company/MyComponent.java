package com.company;

import com.company.figures.*;
import com.company.figuresDrawers.ArcDrawer;
import com.company.figuresDrawers.EllipseDrawer;
import com.company.figuresDrawers.LineDrawer;
import com.company.figuresDrawers.RectDrawer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Валерий on 28.02.2017.kl;lk;
 */
public class MyComponent extends JComponent {

    Graphics g;

    private ArrayList<Figure> figureList = new ArrayList<>();
    private LineDrawer lineDrawer;
    private ArcDrawer arcDrawer;
    private EllipseDrawer ellipseDrawer;
    private RectDrawer rectDrawer;
    private int countLines;

  /* public void drawing(Graphics g) {

        for (int i = 0; i < figureList.size(); i++) {

            figureList.get(i).draw(g);
        }
    }*/


    /*public void addFigure(Figure figure) {

        figureList.add(figure);
    }*/

    //private ArrayList<LineDrawer>  lineDrawers = new ArrayList<>();
    private int countArcs;
    private int countEllipses;
    private int countRects;
    private ArrayList<Line> lineArrayList = new ArrayList<>();
    private ArrayList<Arc> arcs = new ArrayList<>();
    private ArrayList<Ellipse> ellipses = new ArrayList<>();
    private ArrayList<Rect> rectangles = new ArrayList<>();

    @Override
    public void paintComponent(Graphics g) {
        drawing(g);
    }

    public int getCountEllipses() {
        return countEllipses;
    }

    public void setCountEllipses(int countEllipses) {
        this.countEllipses = countEllipses;
    }

    public int getCountRects() {
        return countRects;
    }

    public void setCountRects(int countRects) {
        this.countRects = countRects;
    }

    public int getCountArcs() {
        return countArcs;
    }

    public void setCountArcs(int countArcs) {
        this.countArcs = countArcs;
    }

    public int getCountLines() {
        return countLines;
    }

    public void setCountLines(int countLines) {
        this.countLines = countLines;
    }

    public void addLineArrayList(Line line) {
        lineArrayList.add(line);
    }

    public void addArcs(Arc arc) {
        arcs.add(arc);
    }

    public void addEllipses(Ellipse ellipse) {
        ellipses.add(ellipse);
    }

    public void addRectangles(Rect rect) {
        rectangles.add(rect);
    }

   /*public void  addFigureDrawer(LineDrawer figureDrawer){
       lineDrawers.add(figureDrawer);
   }*/

    public void drawing(Graphics g) {
        for (int i = 0; i < countLines; i++) {

            lineDrawer.draw(g, lineArrayList.get(i).getFirstPoint(), lineArrayList.get(i).getLastPoint());
        }
        for (int i = 0; i < countEllipses; i++) {

            ellipseDrawer.draw(g, ellipses.get(i).getFirstPoint(), ellipses.get(i).getLastPoint());
        }
        for (int i = 0; i < countArcs; i++) {

            arcDrawer.draw(g, arcs.get(i).getFirstPoint(), arcs.get(i).getLastPoint(), arcs.get(i).getStartAngle(), arcs.get(i).getLastAngle());
        }
        for (int i = 0; i < countRects; i++) {

            rectDrawer.draw(g, rectangles.get(i).getFirstPoint(), rectangles.get(i).getHeight(), rectangles.get(i).getWidth());
        }

    }
}