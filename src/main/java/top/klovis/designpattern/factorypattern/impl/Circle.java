package top.klovis.designpattern.factorypattern.impl;

import top.klovis.designpattern.factorypattern.Shape2;

/**
 * @program: design-pattern
 * @description: Circle
 * @author: klovis
 * @create: 2018-05-18 08:40
 **/
public class Circle implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
