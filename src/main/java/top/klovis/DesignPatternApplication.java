package top.klovis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.klovis.abstractfactorypattern.enums.ColorType;
import top.klovis.abstractfactorypattern.enums.FactoryType;
import top.klovis.abstractfactorypattern.feature.Color;
import top.klovis.abstractfactorypattern.feature.Shape;
import top.klovis.abstractfactorypattern.FactoryProducer;
import top.klovis.abstractfactorypattern.enums.ShapeType;
import top.klovis.abstractfactorypattern.factory.AbstractFactory;
import top.klovis.factorypattern.Shape2;
import top.klovis.factorypattern.ShapeFactory2;
import top.klovis.factorypattern.ShapeType2;

@SpringBootApplication
public class DesignPatternApplication {
	private static Logger logger = LoggerFactory.getLogger(DesignPatternApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
        abstractFactoryDemo();
	}

	public static void abstractFactoryDemo() {

    }
}
