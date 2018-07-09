package top.klovis.singletonpattern;

/**
 * 饿汉式
 * Created by klovis on 2018/5/22.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}