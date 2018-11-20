package decorator;

public class BaseDecorator implements Decorator{
    Thing t;
    Decorator plusDecorator;

    public BaseDecorator(Thing t){
        this.t = t;
    }

    public BaseDecorator(Thing t, Decorator dec){
        this.t = t;
        plusDecorator = dec;
    }

    @Override
    public String getString() {
        return t.getString() + "BaseDecorator" + (plusDecorator != null ? plusDecorator.getString(): "");
    }
}
