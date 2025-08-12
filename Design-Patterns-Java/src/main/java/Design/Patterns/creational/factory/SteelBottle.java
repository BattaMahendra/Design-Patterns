package Design.Patterns.creational.factory;

public class SteelBottle extends Bottle{
    @Override
    public void typeOfMaterial() {
        this.material="steel";
        System.out.println("\n \n Here is your "+this.material+" bottle");
    }
}
