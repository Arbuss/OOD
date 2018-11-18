package builder;

import java.util.Objects;

public class Computer {
    private String cpu;
    private String gpu;
    private String motherboard;
    private int ram;
    private String type;

    public Computer() {};

    public Computer(String cpu, String gpu, String motherboard, String type, int ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                Objects.equals(cpu, computer.cpu) &&
                Objects.equals(gpu, computer.gpu) &&
                Objects.equals(motherboard, computer.motherboard) &&
                Objects.equals(type, computer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, motherboard, ram, type);
    }
}
