package Design.Patterns.structural.decorator.practice;

public class Test {

    public static void main(String[] args) {

        // Create a Basic car
        BasicCar car = new BasicCar();
        System.out.println(" Car created is : "+ car.getDescription()+" and price is : "+car.getPrice());

        // car with leather seats
        Car carWithLeatherSeats = new LeatherSeatDecorator(car);
        System.out.println(" Car created is : "+ carWithLeatherSeats.getDescription()+" and price is : "+carWithLeatherSeats.getPrice());

        //car with extra fittings and leather seats
        Car extraFitsCar = new ExtraFittingDecorator(carWithLeatherSeats);
        System.out.println(" Car created is : "+ extraFitsCar.getDescription()+" and price is : "+extraFitsCar.getPrice());
    }
}
