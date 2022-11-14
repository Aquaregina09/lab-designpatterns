package item3.factory;

import item3.Circle;
import item3.Rectangle;
import item3.Shape;
import item3.ShapeType;
import item3.Square;

public class ShapeFactory {
    private static ShapeFactory INSTANCE;

    public static ShapeFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShapeFactory();
        }
        return INSTANCE;
    }

    private ShapeFactory() {
    }

    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}
