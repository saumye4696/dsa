package designpatterns.factory;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;

    public PCFactory(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, cpu);
    }
}
