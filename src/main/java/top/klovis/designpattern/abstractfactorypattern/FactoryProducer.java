package top.klovis.designpattern.abstractfactorypattern;

import top.klovis.designpattern.abstractfactorypattern.enums.FactoryType;
import top.klovis.designpattern.abstractfactorypattern.factory.AbstractFactory;
import top.klovis.designpattern.abstractfactorypattern.factory.ColorFactory;
import top.klovis.designpattern.abstractfactorypattern.factory.ShapeFactory;

/**
 * @program: design-pattern
 * @description: FactoryProducer
 * @author: klovis
 * @create: 2018-05-21 23:35
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (factoryType == FactoryType.SHAPE) {
            return new ShapeFactory();
        }
        else if (factoryType == FactoryType.COLOR) {
            return new ColorFactory();
        }
        return null;
    }
}
