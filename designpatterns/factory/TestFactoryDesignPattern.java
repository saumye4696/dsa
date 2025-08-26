package designpatterns.factory;

public class TestFactoryDesignPattern {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern testing");

        Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "2.9 GHz"));
        System.out.println(pc.getRam());
        System.out.println(pc.getCpu());
    }
}
