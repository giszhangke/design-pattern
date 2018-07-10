package top.klovis.statepattern;

/**
 * Created by klovis on 2018/7/11.
 */
public class InitState implements State {
    private Context context;

    public InitState(Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        System.out.println("Already inited!");
    }

    @Override
    public void start() {
        System.out.println("Game is going to start!");
        this.context.setCurrentState(this.context.getStartSate());
        System.out.println("Game started!");
    }

    @Override
    public void end() {
        System.out.println("Game cannot end, cause it's not started!");
    }
}
