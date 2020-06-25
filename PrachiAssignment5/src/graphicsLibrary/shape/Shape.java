package graphicsLibrary.shape;

import graphicsLibrary.util.Point;

import java.util.Date;

public interface Shape {
    public double getArea();
    public double getPerimeter();
    public Point getOrigin();
    public boolean isPointEnclosed();
}
