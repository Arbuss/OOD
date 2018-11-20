package mediator;

public class ComponentB implements Component{
    Mediator mediator;

    public ComponentB(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public String operation(){
        return mediator.react(this);
    }
}
