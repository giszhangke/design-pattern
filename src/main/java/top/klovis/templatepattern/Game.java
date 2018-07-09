package top.klovis.templatepattern;

/**
 * Created by klovis on 2018/7/9.
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();
    public abstract void morePlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
        if (overtime()) {
            morePlay();
        }
    }

    /**
     * hook
     * @return
     */
    public boolean overtime() {
        return false;
    }
}
