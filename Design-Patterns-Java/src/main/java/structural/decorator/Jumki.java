package structural.decorator;

public class Jumki extends  HemaDecorator{
    public Jumki(Hema specialHema) {
        super(specialHema);
    }

    public String decoratingHems(){
        return specialHema.decoratingHems() +addJumki();
    }


    public String addJumki(){
        return " and beautiful jumkis";
    }
}
