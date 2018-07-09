package top.klovis.abstractfactorypattern.factory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.klovis.abstractfactorypattern.FactoryProducer;
import top.klovis.abstractfactorypattern.enums.ColorType;
import top.klovis.abstractfactorypattern.enums.FactoryType;
import top.klovis.abstractfactorypattern.enums.ShapeType;
import top.klovis.abstractfactorypattern.feature.Color;
import top.klovis.abstractfactorypattern.feature.Shape;

import static org.junit.Assert.*;

/**
 * Created by klovis on 2018/7/9.
 */
public class AbstractFactoryTest {
    private Logger logger = LoggerFactory.getLogger(AbstractFactoryTest.class);
    @Test
    public void abstractFactory() {
        logger.info("-----Abstract factory pattern-----");
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        circle.draw();
        rectangle.draw();
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        Color red = colorFactory.getColor(ColorType.RED);
        Color green = colorFactory.getColor(ColorType.GREEN);
        Color blue = colorFactory.getColor(ColorType.BLUE);
        red.fill();
        green.fill();
        blue.fill();
        logger.info("----------------------------------");
    }
}