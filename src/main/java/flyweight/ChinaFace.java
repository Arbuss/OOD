package flyweight;

public class ChinaFace {
    private int len;
    private int wid;

    public ChinaFace(int length, int width){
        len = length;
        wid = width;
    }

    public int getLen() {
        return len;
    }

    public int getWid() {
        return wid;
    }
}
