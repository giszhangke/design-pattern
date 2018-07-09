package top.klovis.singletonpattern;

/**
 * 饿汉式
 * Created by klovis on 2018/5/22.
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance(){
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}