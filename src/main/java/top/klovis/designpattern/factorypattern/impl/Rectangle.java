package top.klovis.designpattern.factorypattern.impl;

import top.klovis.designpattern.factorypattern.Shape2;

/**
 * @program: design-pattern
 * @description: Rectangle
 * @author: klovis
 * @create: 2018-05-18 08:43
 **/
public class Rectangle implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
