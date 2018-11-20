package chain_of_responsibility;

public class HandlerA implements Handler{
    private Handler next;

    public HandlerA(Handler handler){
        next = handler;
    }

    public Object handle(Object obj){
        if(!obj.getClass().equals(int.class))
            return next.handle(obj);
        else
            return DataBase.add((int)obj);
    }
}
