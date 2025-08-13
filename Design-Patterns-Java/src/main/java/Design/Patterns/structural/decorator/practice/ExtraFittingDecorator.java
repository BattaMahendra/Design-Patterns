package Design.Patterns.structural.decorator.practice;

public class ExtraFittingDecorator extends CarDecorator{

    public ExtraFittingDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        // Use the abstract class instance variable car for retaining same object
        return car.getDescription() + " With Extra Fittings";
    }

    @Override
    public Double getPrice() {
        return car.getPrice() +10.0;
    }
}
