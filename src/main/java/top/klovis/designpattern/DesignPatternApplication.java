package top.klovis.designpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.klovis.designpattern.abstractfactorypattern.FactoryProducer;
import top.klovis.designpattern.abstractfactorypattern.enums.ColorType;
import top.klovis.designpattern.abstractfactorypattern.enums.FactoryType;
import top.klovis.designpattern.abstractfactorypattern.enums.ShapeType;
import top.klovis.designpattern.abstractfactorypattern.factory.AbstractFactory;
import top.klovis.designpattern.abstractfactorypattern.feature.Color;
import top.klovis.designpattern.abstractfactorypattern.feature.Shape;
import top.klovis.designpattern.factorypattern.Shape2;
import top.klovis.designpattern.factorypattern.ShapeFactory2;
import top.klovis.designpattern.factorypattern.ShapeType2;

@SpringBootApplication
public class DesignPatternApplication {
	private static Logger logger = LoggerFactory.getLogger(DesignPatternApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		factoryDemo();
        abstractFactoryDemo();
	}

	public static void factoryDemo() {
		logger.info("----------Factory pattern --------");
		ShapeFactory2 shapeFactory = new ShapeFactory2();
		Shape2 circle = shapeFactory.getShape(ShapeType2.CIRCLE.name());
		Shape2 rectangle = shapeFactory.getShape(ShapeType2.RECTANGLE.name());
		Shape2 square = shapeFactory.getShape(ShapeType2.SQUARE.name());
		circle.draw();
		rectangle.draw();
		square.draw();
		logger.info("----------------------------------");
	}

	public static void abstractFactoryDemo() {
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
