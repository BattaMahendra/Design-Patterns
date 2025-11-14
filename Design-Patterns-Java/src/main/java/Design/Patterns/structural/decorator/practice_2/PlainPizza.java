package Design.Patterns.structural.decorator.practice_2;

public class PlainPizza implements Pizza{
    @Override
    public void description() {
        System.out.println("Plain Pizza ");
    }

    @Override
    public Double price() {
        return 10.0;
    }
}
