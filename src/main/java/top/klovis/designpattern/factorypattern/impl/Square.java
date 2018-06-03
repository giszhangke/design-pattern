package top.klovis.designpattern.factorypattern.impl;

import top.klovis.designpattern.factorypattern.Shape2;

/**
 * @program: design-pattern
 * @description: Square
 * @author: klovis
 * @create: 2018-05-18 08:42
 **/
public class Square implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
