package Design.Patterns.structural.decorator.practice_2;

public abstract  class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void description() {
        pizza.description();
    }

    @Override
    public Double price() {
        return pizza.price();
    }
}
