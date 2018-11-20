package bridge;

public class StrongGod implements God{
    private Thing thing;

    public StrongGod(Thing thing){
        this.thing = thing;
        this.thing.create();
    }

    @Override
    public void create() {
        if(thing.isExists())
            thing.destroy();
        else
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
