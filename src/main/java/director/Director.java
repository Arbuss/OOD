package director;

import builder.Builder;
import builder.Computer;

public class Director {
    public Computer constructWeakPC(Builder builder){
        builder.create();
        builder.setCPU("phenom x2");
        builder.setGPU("rx 270");
        builder.setMotherboard("am1");
        builder.setRAM(1);
        return builder.getComputer();
    }
}
