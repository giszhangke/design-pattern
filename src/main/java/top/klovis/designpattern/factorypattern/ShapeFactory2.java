package top.klovis.designpattern.factorypattern;

import top.klovis.designpattern.factorypattern.impl.Circle;
import top.klovis.designpattern.factorypattern.impl.Rectangle;
import top.klovis.designpattern.factorypattern.impl.Square;

/**
 * @program: design-pattern
 * @description: ShapeFactory2
 * @author: klovis
 * @create: 2018-05-18 08:45
 **/
public class ShapeFactory2 {
    public Shape2 getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        else if (shapeType.equalsIgnoreCase(ShapeType2.CIRCLE.name())) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase(ShapeType2.RECTANGLE.name())) {
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase(ShapeType2.SQUARE.name())) {
            return new Square();
        }
        return null;
    }
}
