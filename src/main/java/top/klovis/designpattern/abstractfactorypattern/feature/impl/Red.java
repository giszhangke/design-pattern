package top.klovis.designpattern.abstractfactorypattern.feature.impl;

import top.klovis.designpattern.abstractfactorypattern.feature.Color;

/**
 * @program: design-pattern
 * @description: Red
 * @author: klovis
 * @create: 2018-05-21 23:15
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Red");
    }
}
