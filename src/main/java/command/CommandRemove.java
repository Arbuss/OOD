package command;

import java.util.List;

public class CommandRemove implements Command{
    private List<Object> list;
    private Object obj;

    public CommandRemove(List<Object> list, Object obj){
        this.list = list;
        this.obj = obj;
    }

    public boolean execute(){
        return list.remove(obj);
    }
}
