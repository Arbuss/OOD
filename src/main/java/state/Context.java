package state;

public class Context {
    State state;

    public Context(State initState){
        state = initState;
    }

    public void setState(State state){
        this.state = state;
    }

    public String doThis(){
        return state.doSmth();
    }
}
