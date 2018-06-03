package top.klovis.designpattern.abstractfactorypattern.feature.impl;

import top.klovis.designpattern.abstractfactorypattern.feature.Shape;

/**
 * @program: design-pattern
 * @description: Circle
 * @author: klovis
 * @create: 2018-05-21 22:24
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
