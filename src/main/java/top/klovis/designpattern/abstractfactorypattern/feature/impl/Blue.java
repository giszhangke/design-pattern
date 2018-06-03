package top.klovis.designpattern.abstractfactorypattern.feature.impl;

import top.klovis.designpattern.abstractfactorypattern.feature.Color;

/**
 * @program: design-pattern
 * @description: Blue
 * @author: klovis
 * @create: 2018-05-21 23:15
 **/
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Blue");
    }
}
