package mediator;

public class SpecMediator implements Mediator{
    @Override
    public String react(Component comp) {
        if(comp.getClass().equals(ComponentA.class))
            return "a";
        if(comp.getClass().equals(ComponentB.class))
            return "b";

        return null;
    }
}
