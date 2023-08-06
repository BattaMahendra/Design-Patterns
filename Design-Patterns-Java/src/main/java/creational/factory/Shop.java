package creational.factory;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        System.out.println("Welcome to Bottle shop\nplease provide the type of bottle you want\n1. steel\n2. plastic \n3. mud ");

        Scanner s = new Scanner(System.in);
        while(true) {
            String materialType = s.nextLine();
            if(materialType=="1")  System.exit(0);
            BottleFactory factory = new BottleFactory();
            factory.getBottle(materialType).typeOfMaterial();
            System.out.println("\n\n\n\nDo you still want to stop ?\n then provide material \nif you want to finish give 1.");
        }

    }
}
