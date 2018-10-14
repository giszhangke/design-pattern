package top.klovis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
