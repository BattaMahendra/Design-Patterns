package Design.Patterns.structural.decorator.practice_2;

public class PepparoniPizzaDecorator extends PizzaDecorator{

    public PepparoniPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("with Pepperoni");
    }

    @Override
    public Double price() {
        return super.price()+10.0;
    }
}
