package creational.singleton;

public class Mouse {
    private int price;
    private String model;

     static final Mouse mouse = new Mouse();
    private Mouse(){
        System.out.println("I am the mouse constructor");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
