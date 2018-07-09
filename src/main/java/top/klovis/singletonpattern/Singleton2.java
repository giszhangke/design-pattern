package top.klovis.singletonpattern;

/**
 * 懒汉模式
 * 静态内部类
 * Created by klovis on 2018/7/10.
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static class LazyHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static final Singleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
