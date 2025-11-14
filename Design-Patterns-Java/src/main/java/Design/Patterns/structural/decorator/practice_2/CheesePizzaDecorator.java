package Design.Patterns.structural.decorator.practice_2;

public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("with Cheese");
    }

    @Override
    public Double price() {
        return super.price()+10.0;
    }
}
