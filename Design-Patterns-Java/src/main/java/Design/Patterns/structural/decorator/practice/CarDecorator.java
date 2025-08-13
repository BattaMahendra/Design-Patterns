package Design.Patterns.structural.decorator.practice;

public abstract class CarDecorator implements Car {

    public Car car;

   public CarDecorator(Car car){
       this.car = car;
   }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public Double getPrice() {
        return car.getPrice();
    }
}
