package Design.Patterns.creational.factory;



/**
 * When to use Factory design pattern
 * 1. When a parent have multiple subclasses.
 * 2. Using this we can promote loose coupling by differentiating object creation from clients
 * 3. Factory class will take care of the object creation.
 * 4. Client doesn't need to change anything if some changes occur in object creation
 * 5. Client doesn't need to know nitty-gritty details of object creation. It just tells type of object it needs.
 *
 * Simply you can use it when
 * 1. Object creation is very complex (so that we can maintain creation at one place - single responsibility principle)
 * 2. When you know the objects will have many changes in the future. So the client is not effected.
 * 3. If you want to hide the object creation logic from clients.
 *
 * Downsides of Factory Design pattern
 *
 * 1. Sometimes due to over complexity , factory class can become bloated with too many if-else
 * 2. When the creation of object is simple , factory pattern is discouraged.
 * 3. Runtime errors: If you pass wrong type strings or configs, you only find out at runtime.
 * 4. Extra abstraction: More classes/methods to manage.
 * */
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

/*
* If you closely observe the method getBottle(String) violates open closed principle
* for simplicity I have done this , you should not do like this*/
