package top.klovis.designpattern.abstractfactorypattern.feature.impl;

import top.klovis.designpattern.abstractfactorypattern.feature.Color;

/**
 * @program: design-pattern
 * @description: Green
 * @author: klovis
 * @create: 2018-05-21 23:15
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Green");
    }
}
