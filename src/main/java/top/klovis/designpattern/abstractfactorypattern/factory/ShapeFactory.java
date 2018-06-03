package top.klovis.designpattern.abstractfactorypattern.factory;

import top.klovis.designpattern.abstractfactorypattern.enums.ColorType;
import top.klovis.designpattern.abstractfactorypattern.enums.ShapeType;
import top.klovis.designpattern.abstractfactorypattern.feature.Color;
import top.klovis.designpattern.abstractfactorypattern.feature.Shape;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Circle;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Rectangle;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Square;

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
