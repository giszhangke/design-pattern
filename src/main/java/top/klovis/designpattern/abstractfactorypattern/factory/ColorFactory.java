package top.klovis.designpattern.abstractfactorypattern.factory;

import top.klovis.designpattern.abstractfactorypattern.enums.ColorType;
import top.klovis.designpattern.abstractfactorypattern.enums.ShapeType;
import top.klovis.designpattern.abstractfactorypattern.feature.Color;
import top.klovis.designpattern.abstractfactorypattern.feature.Shape;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Blue;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Green;
import top.klovis.designpattern.abstractfactorypattern.feature.impl.Red;

/**
 * @program: design-pattern
 * @description: ColorFactory
 * @author: klovis
 * @create: 2018-05-21 23:17
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }

    @Override
    public Color getColor(ColorType colorType) {
        if (colorType == ColorType.RED) {
            return new Red();
        }
        else if (colorType == ColorType.GREEN) {
            return new Green();
        }
        else if (colorType == ColorType.BLUE) {
            return new Blue();
        }
        return null;
    }
}
