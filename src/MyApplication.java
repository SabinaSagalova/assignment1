import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/sabinasagalova/IdeaProjects/assignment1/src/source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        Point startPoint = null;
        Point previousPoint = null;

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
            if (previousPoint != null) {
                double distance = previousPoint.distance(point);
                System.out.println("Distance between " + previousPoint + " and " + " = " + distance);
            } else {
                startPoint = point;
            }
            previousPoint = point;
        }
        if (previousPoint != null && startPoint != null) {
            double distance = previousPoint.distance(startPoint);
            System.out.println("Distance between " + previousPoint + " and " + startPoint + " = " + distance);
        }

        System.out.println("The Perimeter is " + shape.getPerimeter());
        System.out.println("The Average Side is " + shape.getAverageSide());
        System.out.println("The Longest Side is " + shape.getLongestSide());
    }
}