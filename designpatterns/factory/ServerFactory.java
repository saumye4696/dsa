package designpatterns.factory;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;

    public ServerFactory(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, cpu);
    }
}
