package creational.factory;

public class PlasticBottle extends Bottle {

    @Override
    public void typeOfMaterial() {
        this.material="plastic";
        System.out.println("\n \n Here is your "+this.material+" bottle");
    }
}
