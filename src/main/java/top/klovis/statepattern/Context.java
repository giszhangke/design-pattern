package top.klovis.statepattern;

/**
 * Created by klovis on 2018/7/11.
 */
public class Context {
    private State notInitState;
    private State initState;
    private State startSate;
    private State endState;
    private State currentState;

    public Context() {
        this.currentState = new NotInitState(this);
        this.notInitState = new NotInitState(this);
        this.initState = new InitState(this);
        this.startSate = new StartState(this);
        this.endState = new EndState(this);
    }

    public void init() {
        this.currentState.init();
    }

    public void start() {
        this.currentState.start();
    }

    public void end() {
        this.currentState.end();
    }

    public State getNotInitState() {
        return notInitState;
    }

    public void setNotInitState(State notInitState) {
        this.notInitState = notInitState;
    }

    public State getInitState() {
        return initState;
    }

    public void setInitState(State initState) {
        this.initState = initState;
    }

    public State getStartSate() {
        return startSate;
    }

    public void setStartSate(State startSate) {
        this.startSate = startSate;
    }

    public State getEndState() {
        return endState;
    }

    public void setEndState(State endState) {
        this.endState = endState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
