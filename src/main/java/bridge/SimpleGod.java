package bridge;

public class SimpleGod implements God{
    private Thing thing;

    public SimpleGod(Thing thing){
        this.thing = thing;
        this.thing.create();
    }

    @Override
    public void create() {
        thing.create();
    }

    @Override
    public void setColor(String str) {
        thing.setColor(str);
    }

    @Override
    public void setShape(String str) {
        thing.setShape(str);
    }
}
