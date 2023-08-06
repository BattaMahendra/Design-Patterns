package creational.factory;

public class BottleFactory {
    public Bottle getBottle(String typeOfMaterial){

        if(typeOfMaterial==null|| typeOfMaterial.isEmpty()) {
            throw new IllegalArgumentException("please give proper material");
        }
        typeOfMaterial=typeOfMaterial.toLowerCase();

        switch (typeOfMaterial){
            case "steel": return new SteelBottle();
            case "plastic": return new PlasticBottle();
            case "mud": return new MudBottle();
            default: throw new IllegalArgumentException("invalid material");
        }
    }
}
