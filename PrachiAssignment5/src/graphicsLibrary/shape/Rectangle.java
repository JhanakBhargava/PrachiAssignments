package graphicsLibrary.shape;

import graphicsLibrary.util.Point;

import java.util.Date;

public class Rectangle implements Shape{
    private Point point;
    private int length;
    private int breadth;
    private Date timestamp;

    public Rectangle(Point point, int length, int breadth) {
        this.point = point;
        this.length = length;
        this.breadth = breadth;
        this.timestamp = new Date();
    }

    @Override
    public double getArea() {
        return length*breadth;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+breadth);
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
