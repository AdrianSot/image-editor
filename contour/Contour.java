package contour;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class Contour {
    private final int INITIAL_SIZE = 50;
    private final int label;
    private final List<Point> points;

    public Contour (int label) {
            this.label = label;
            points = new ArrayList<Point>(INITIAL_SIZE);
    }

    protected void addPoint (Point p) {
            points.add(p);
    }

    public List<Point> getPointList() {
        return points;
    }

    public Point[] getPointArray() {
        return points.toArray(new Point[0]);
    }
    
    public int getSize(){
        return points.size();
    }
}
