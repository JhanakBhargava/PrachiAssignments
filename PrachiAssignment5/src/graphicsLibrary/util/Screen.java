package graphicsLibrary.util;

import graphicsLibrary.shape.*;

import java.util.List;

public class Screen {
    private List<Shape> shapes;

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void deleteShape(Shape shape) {
        shapes.remove(shape);
    }

    public <shape> void deleteShapeType(Shape shape) {
        for (Shape shape1 : shapes) {
            if (shape1 instanceof Circle) {
                shapes.remove(shape1);
            } else if (shape1 instanceof Rectangle) {
                shapes.remove(shape1);
            } else if (shape1 instanceof Square) {
                shapes.remove(shape1);
            } else if (shape1 instanceof Triangle) {
                shapes.remove(shape1);
            }
        }
    }

}
