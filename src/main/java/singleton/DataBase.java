package singleton;

import java.util.List;

public class DataBase {
    private static List<Integer> list;

    public static void add(int i){
        list.add(i);
    }

    public static void remove(int i){
        list.remove(new Integer(i));
    }
}
