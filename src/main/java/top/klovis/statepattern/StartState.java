package top.klovis.statepattern;

/**
 * Created by klovis on 2018/7/10.
 */
public class StartState implements State {
    private Context context;

    public StartState (Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        System.out.println("Sorry, game started. You cannot init!");
    }

    @Override
    public void start() {
        System.out.println("Already started!");
    }

    @Override
    public void end() {
        System.out.println("Game is going to end!");
        this.context.setCurrentState(this.context.getEndState());
        System.out.println("Game ended!");
    }
}
