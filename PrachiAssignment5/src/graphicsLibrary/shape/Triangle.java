package graphicsLibrary.shape;

import graphicsLibrary.util.Point;

import java.util.Date;

public class Triangle implements Shape{
    private Point point;
    private int height;
    private int base;
    private Date timestamp;

    public Triangle(Point point, int height, int base) {
        this.point = point;
        this.height = height;
        this.base = base;
        this.timestamp = new Date();
    }

    @Override
    public double getArea() {
        return base*height/2;
    }

    @Override
    public double getPerimeter() {
        return base+height;
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
