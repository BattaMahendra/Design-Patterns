package Design.Patterns.structural.decorator;

public class Shoes extends  ModernHema{
    public Shoes(Hema specialHema) {
        super(specialHema);
    }
    public String decoratingHems(){
        return specialHema.decoratingHems() +addShoes();
    }


    public String addShoes(){
        return " with  adidas shoes";
    }
}
