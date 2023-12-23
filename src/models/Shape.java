package models;

import unique_method.Сalculations;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();
    public void addPoint(Point point) {
        points.add(point);
    }
    public double getAverageSide() {
        return Сalculations.getAvg(getSides());
    }

    public double getPerimeter() {
        return Сalculations.getSum(getSides());
    }

    public double getLongestSide() {
        return Сalculations.getMax(getSides());
    }

    private double[] getSides() {
        int n = points.size();
        double[] sides = new double[n];
        for (int i = 0; i < n; i++) {
            Point currentVertex = points.get(i);
            Point nextVertex = points.get((i + 1) % n);
            sides[i] = currentVertex.distance(nextVertex);
        }
        return sides;
    }
}
