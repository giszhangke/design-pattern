package top.klovis.abstractfactorypattern.factory;

import top.klovis.abstractfactorypattern.enums.ColorType;
import top.klovis.abstractfactorypattern.feature.Color;
import top.klovis.abstractfactorypattern.feature.impl.Circle;
import top.klovis.abstractfactorypattern.feature.impl.Square;
import top.klovis.abstractfactorypattern.enums.ShapeType;
import top.klovis.abstractfactorypattern.feature.Shape;
import top.klovis.abstractfactorypattern.feature.impl.Rectangle;

/**
 * @program: design-pattern
 * @description: ShapeFactory2
 * @author: klovis
 * @create: 2018-05-21 22:58
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        }
        else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }
}
