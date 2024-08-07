package creational.prototype;

public abstract class ComputerFactory {
    String company;
    String model;
    double cost;

    public abstract ComputerFactory copy();
}
