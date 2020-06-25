package graphicsLibrary.shape;

import graphicsLibrary.util.Point;

import java.util.Date;

public class Square implements Shape{
    private Point point;
    private int side;
    private Date timestamp;

    public Square(Point point, int side) {
        this.point = point;
        this.side = side;
        this.timestamp = new Date();
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
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
