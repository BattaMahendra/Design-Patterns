package structural.decorator;

public class TraditionalHema extends HemaDecorator{
    public TraditionalHema(Hema specialHema) {
        super(specialHema);
    }

    public String decoratingHems(){
        return specialHema.decoratingHems() +addTraditionalDress();
    }


    public String addTraditionalDress(){
        return " with traditinal dress";
    }
}
