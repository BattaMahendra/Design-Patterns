package Design.Patterns.structural.decorator.practice;

public class BasicCar implements  Car{
    @Override
    public String getDescription() {
        return "Basic car ";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}
