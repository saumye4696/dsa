package designpatterns.factory;

public class PC extends Computer {
    private String ram;
    private String cpu;

    public PC(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }
    
}
