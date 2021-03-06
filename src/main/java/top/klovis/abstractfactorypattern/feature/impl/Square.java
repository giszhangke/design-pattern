package top.klovis.abstractfactorypattern.feature.impl;

import top.klovis.abstractfactorypattern.feature.Shape;

/**
 * @program: design-pattern
 * @description: Square
 * @author: klovis
 * @create: 2018-05-21 22:24
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
