package item3;

import item3.factory.ShapeFactory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.newInstance();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }

}
