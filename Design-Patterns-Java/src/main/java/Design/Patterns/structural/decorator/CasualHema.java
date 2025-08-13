package Design.Patterns.structural.decorator;


/*
* This class is the original base class or product up on which decorators are used.
* */
public class CasualHema implements  Hema{
    @Override
    public String decoratingHems() {
        return "Hema ";
    }
}
