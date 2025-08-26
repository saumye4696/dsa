package designpatterns.factory;

public class Server extends Computer {
    private String ram;
    private String cpu;

    public Server(String ram, String cpu) {
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
