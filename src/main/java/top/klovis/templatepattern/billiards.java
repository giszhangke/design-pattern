package top.klovis.templatepattern;

/**
 * @Description 台球
 * Created by klovis on 2018/7/9.
 */
public class Billiards extends Game {
    @Override
    public void initialize() {
        System.out.println("Billiards initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Billiards started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Billiards finished!");
    }

    @Override
    public void morePlay() {
        return;
    }
}
