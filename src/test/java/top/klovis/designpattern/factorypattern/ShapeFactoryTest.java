package top.klovis.designpattern.factorypattern;

import org.junit.Test;
import org.springframework.util.Assert;

public class ShapeFactoryTest {
    @Test
    public void getShape() throws Exception {
        Assert.isTrue("CIRCLE".equalsIgnoreCase(ShapeType2.CIRCLE.name()), "ShapeType2.CIRCLE.name() != CIRCLE");
    }

}