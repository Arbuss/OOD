package bridge;

public interface Thing {
    boolean isExists();
    String getColor();
    String getShape();

    void setShape(String str);
    void setColor(String str);

    void create();
    void destroy();
}
