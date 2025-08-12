package creational.factory;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        System.out.println("Welcome to Bottle shop\nplease provide the type of bottle you want\n1. steel\n2. plastic \n3. mud ");

        Scanner s = new Scanner(System.in);
        while(true) {
            String materialType = s.nextLine();
            if(materialType.equals("1"))  System.exit(0);
            /**
             * here instead of directly using the bottle classed to instantiate object
             * we use BottleFactory which creates us the bottle type.
             * so the instantiation of  objects is hidden from client.
             * 
             * because of the factory pattern we have achieved abstraction and also our core 
             * bottle classes are loosely coupled without depending on the client class.
             */
            
            BottleFactory factory = new BottleFactory();
            
            Bottle bottle = factory.getBottle(materialType);
            //using if block in order to avoid null pointer exception when null is returned from above line
            if(bottle != null){
                bottle.typeOfMaterial();
            }
            System.out.println("\n\n\n=====================Do you still want to stop ? ========================\n then provide material \nif you want to finish give 1.");
        }

    }
}
