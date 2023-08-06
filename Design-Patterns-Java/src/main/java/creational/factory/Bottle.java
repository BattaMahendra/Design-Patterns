package creational.factory;

public abstract class Bottle {
    /**
     * we can't instantiate abstract class
     * */
    protected  String material;
    public abstract void typeOfMaterial();

    public void getBottle(){
        System.out.println("here is your "+material+" bottle ");
    }
}
