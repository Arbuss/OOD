package proxy;

public class PseudoDemetrius implements Tsar{
    private Demetrius demetrius;
    private int counter;

    public PseudoDemetrius(Demetrius dim){
        demetrius = dim;
        counter = 0;
    }

    public PseudoDemetrius(){
        counter = 0;
    }

    @Override
    public void attackOnRussia() {
        if(counter < 3)
            counter++;
        else
            if(demetrius != null)
                demetrius.attackOnRussia();
            else{
                demetrius = new Demetrius();
                demetrius.attackOnRussia();
            }
    }
}
