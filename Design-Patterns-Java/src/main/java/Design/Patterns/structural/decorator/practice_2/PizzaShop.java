package Design.Patterns.structural.decorator.practice_2;

public class PizzaShop {

    public static void main(String[] args) {

        Pizza p  = new PlainPizza();
        p.description();
        System.out.println(p.price());

        CheesePizzaDecorator cheeseTopping = new CheesePizzaDecorator(p);
        cheeseTopping.description();
        System.out.println(cheeseTopping.price());

        PepparoniPizzaDecorator pepperoniToppingWithCheese = new PepparoniPizzaDecorator(cheeseTopping);
        pepperoniToppingWithCheese.description();
        System.out.println(pepperoniToppingWithCheese.price());

        Pizza p2 = new CheesePizzaDecorator(new PlainPizza());
    }
}
