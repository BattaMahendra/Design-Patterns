package creational.factory;

public class BottleFactory {
    public Bottle getBottle(String typeOfMaterial){

        if(typeOfMaterial==null|| typeOfMaterial.isEmpty()) {
            System.out.println("please give proper material");
            return  null;
        }
        typeOfMaterial=typeOfMaterial.toLowerCase();

        switch (typeOfMaterial){
            case "steel": return new SteelBottle();
            case "plastic": return new PlasticBottle();
            case "mud": return new MudBottle();
            default:
                System.out.println("invalid bottle material");
        }
        return null;
    }
}
