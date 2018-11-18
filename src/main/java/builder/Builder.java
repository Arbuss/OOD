package builder;

public interface Builder {
    void create();
    void setCPU(String cpu);
    void setGPU(String gpu);
    void setRAM(int ram);
    void setMotherboard(String motherboard);
    Computer getComputer();
}
