package Design.Patterns.structural.decorator;

public class ModernHema extends HemaDecorator{

    public ModernHema(Hema specialHema) {
        super(specialHema);
    }

    public String decoratingHems(){
        return specialHema.decoratingHems() +addModernDress();
    }


    public String addModernDress(){
        return " with stylish dress";
    }
}
