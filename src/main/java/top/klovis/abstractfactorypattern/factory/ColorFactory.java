package top.klovis.abstractfactorypattern.factory;

import top.klovis.abstractfactorypattern.enums.ColorType;
import top.klovis.abstractfactorypattern.enums.ShapeType;
import top.klovis.abstractfactorypattern.feature.Color;
import top.klovis.abstractfactorypattern.feature.Shape;
import top.klovis.abstractfactorypattern.feature.impl.Blue;
import top.klovis.abstractfactorypattern.feature.impl.Green;
import top.klovis.abstractfactorypattern.feature.impl.Red;

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
