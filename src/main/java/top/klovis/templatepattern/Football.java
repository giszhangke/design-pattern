package top.klovis.templatepattern;

/**
 * Created by klovis on 2018/7/9.
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Football started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football finished!");
    }

    @Override
    public void morePlay() {
        System.out.println("Football overtime!");
    }

    @Override
    public boolean overtime() {
        return true;
    }
}
