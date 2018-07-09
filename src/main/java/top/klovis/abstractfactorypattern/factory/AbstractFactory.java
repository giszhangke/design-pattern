package top.klovis.abstractfactorypattern.factory;

import top.klovis.abstractfactorypattern.enums.ColorType;
import top.klovis.abstractfactorypattern.enums.ShapeType;
import top.klovis.abstractfactorypattern.feature.Color;
import top.klovis.abstractfactorypattern.feature.Shape;

/**
 * @program: design-pattern
 * @description: AbstractFactory
 * @author: klovis
 * @create: 2018-05-21 22:54
 **/
public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);

    public abstract Color getColor(ColorType colorType);
}
