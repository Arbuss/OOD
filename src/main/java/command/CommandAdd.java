package command;

import java.util.List;

public class CommandAdd implements Command{
    private List<Object> list;
    private Object obj;

    public CommandAdd(List<Object> list, Object obj){
        this.list = list;
        this.obj = obj;
    }

    public boolean execute(){
        return list.add(obj);
    }
}
