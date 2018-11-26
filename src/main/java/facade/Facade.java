package facade;

import facade.complicated_system.Inc;
import facade.complicated_system.Sout;

public class Facade {
    public static void output(String str){
        Sout.sout(str);
    }

    public static int increment(int i){
        return Inc.increment(i);
    }
}
