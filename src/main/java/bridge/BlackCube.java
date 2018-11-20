package bridge;

public class BlackCube {
    private boolean existence = false;
    private String shape = "cube";
    private String color = "black";

    public void create(){
        existence = true;
    }

    public void destroy(){
        existence = false;
    }

    public boolean isExists(){
        return existence;
    }

    public String getShape(){
        return shape;
    }

    public String getColor(){
        return color;
    }

    public void setShape(String str){
        shape = str;
    }

    public void setColor(String str){
        color = str;
    }
}
