package top.klovis.factorypattern;

import org.junit.Test;
import org.springframework.util.Assert;

public class ShapeFactoryTest {
    @Test
    public void getShape() throws Exception {
        Assert.isTrue("CIRCLE".equalsIgnoreCase(ShapeType2.CIRCLE.name()), "ShapeType2.CIRCLE.name() != CIRCLE");
        ShapeFactory2 shapeFactory = new ShapeFactory2();
        Shape2 circle = shapeFactory.getShape(ShapeType2.CIRCLE.name());
        Shape2 rectangle = shapeFactory.getShape(ShapeType2.RECTANGLE.name());
        Shape2 square = shapeFactory.getShape(ShapeType2.SQUARE.name());
        circle.draw();
        rectangle.draw();
        square.draw();
    }

}