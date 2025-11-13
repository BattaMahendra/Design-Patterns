package Design.Patterns.creational.factory;

public class PlasticBottle extends Bottle {

    @Override
    public void createBottle() {
        this.material="plastic";
        System.out.println("\n \n Here is your "+this.material+" bottle");
    }
}
