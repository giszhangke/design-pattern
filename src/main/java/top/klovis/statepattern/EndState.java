package top.klovis.statepattern;

/**
 * Created by klovis on 2018/7/10.
 */
public class EndState implements State {
    private Context context;

    public EndState(Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        System.out.println("Game is going to init!");
        context.setCurrentState(this.context.getInitState());
        System.out.println("Game initialized!");
    }

    @Override
    public void start() {
        System.out.println("Already started!");
    }

    @Override
    public void end() {
        System.out.println("Game already ended!");
    }
}
