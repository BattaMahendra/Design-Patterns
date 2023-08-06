package creational.factory;

public class MudBottle extends Bottle {

    @Override
    public void typeOfMaterial() {
        this.material="mud";
        System.out.println("\n \n Here is your "+this.material+" bottle");
    }
}
