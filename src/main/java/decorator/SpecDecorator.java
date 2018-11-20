package decorator;

public class SpecDecorator implements Decorator{
    Thing t;
    Decorator plusDecorator;

    public SpecDecorator(Thing t){
        this.t = t;
    }

    public SpecDecorator(Thing t, Decorator dec){
        this.t = t;
        plusDecorator = dec;
    }

    @Override
    public String getString() {
        return t.getString() + "SpecialDecorator" + (plusDecorator != null ? plusDecorator.getString(): "");
    }
}
