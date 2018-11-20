package chain_of_responsibility;

public class HandlerB implements Handler{
    private Handler next;

    public HandlerB(Handler handler){
        next = handler;
    }

    public Object handle(Object obj){
        if(obj.getClass().equals(String.class))
            return DataBase.add(Integer.parseInt((String)obj));

        return null;
    }
}
