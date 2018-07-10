package top.klovis.statepattern;

import javax.management.Notification;

/**
 * Created by klovis on 2018/7/11.
 */
public class NotInitState implements State {
    private Context context;

    public NotInitState(Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        System.out.println("Game is going to init!");
        this.context.setCurrentState(this.context.getInitState());
        System.out.println("Game initialized!");
    }

    @Override
    public void start() {
        System.out.println("Game cannot start before initialized!");
    }

    @Override
    public void end() {
        System.out.println("Game end error!");
    }
}
