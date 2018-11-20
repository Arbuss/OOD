package mediator;

public class ComponentA implements Component{
    Mediator mediator;

    public ComponentA(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public String operation(){
        return mediator.react(this);
    }
}
