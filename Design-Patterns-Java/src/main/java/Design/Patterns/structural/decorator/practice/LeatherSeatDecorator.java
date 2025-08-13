package Design.Patterns.structural.decorator.practice;

public class LeatherSeatDecorator extends CarDecorator{

    public LeatherSeatDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() +" with Leather Seats";
    }

    @Override
    public Double getPrice() {
        return car.getPrice() + 5.0;
    }
}
