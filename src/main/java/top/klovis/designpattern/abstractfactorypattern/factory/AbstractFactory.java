package top.klovis.designpattern.abstractfactorypattern.factory;

import top.klovis.designpattern.abstractfactorypattern.enums.ColorType;
import top.klovis.designpattern.abstractfactorypattern.enums.ShapeType;
import top.klovis.designpattern.abstractfactorypattern.feature.Color;
import top.klovis.designpattern.abstractfactorypattern.feature.Shape;

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
