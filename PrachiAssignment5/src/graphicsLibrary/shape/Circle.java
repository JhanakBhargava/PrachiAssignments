package graphicsLibrary.shape;

import graphicsLibrary.util.Point;

import java.util.Date;

public class Circle implements Shape{
    private Point point;
    private int radius;
    private Date timestamp;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
        this.timestamp = new Date();
    }

    @Override
    public double getArea() {
        return 22/7 * radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*22/7*radius;
    }

    @Override
    public Point getOrigin() {
        return null;
    }

    @Override
    public boolean isPointEnclosed() {
        return false;
    }
}
