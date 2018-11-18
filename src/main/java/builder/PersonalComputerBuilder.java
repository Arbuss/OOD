package builder;

public class PersonalComputerBuilder implements Builder{
    private Computer comp;

    @Override
    public void create() {
        comp = new Computer();
        comp.setType("PC");
    }

    @Override
    public void setCPU(String cpu) {
        comp.setCpu(cpu);
    }

    @Override
    public void setGPU(String gpu) {
        comp.setGpu(gpu);
    }

    @Override
    public void setRAM(int ram) {
        comp.setRam(ram);
    }

    @Override
    public void setMotherboard(String motherboard) {
        comp.setMotherboard(motherboard);
    }

    @Override
    public Computer getComputer(){
        return comp;
    }
}
