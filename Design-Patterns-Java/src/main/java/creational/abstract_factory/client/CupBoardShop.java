package creational.abstract_factory.client;

import java.util.Scanner;

import creational.abstract_factory.object_factories.CupBoardFactory;




public class CupBoardShop {
	
	public static CupBoardFactory factory;
	public static FactoryCreator factoryProvider = new FactoryCreator();

	
	public static void main(String[] args) {
        System.out.println("Welcome to CupBoard shop\nplease provide the type"
        		+ " of CupBoard you want\n1. Wood --> hard and plywood"
        		+ "\n2. Metal --> steel and aluminium \n3. Fiber ---> pvc and fiber  ");

        Scanner s = new Scanner(System.in);
        while(true) {
            String materialType = s.nextLine();
            if(materialType.equalsIgnoreCase("1"))  System.exit(0);
            
            switch(materialType) {
           
			
    		case "wood": {
    			System.out.println("give type of wood ---> hard or plywood");
    			String subMaterial=s.nextLine();
    			factoryProvider.createRequiredFactory(materialType).getCupBoard(subMaterial);	
    			break;
    		}
    		case "metal": {
    			System.out.println("give type of metal ---> steel or aluminium");
    			String subMaterial=s.nextLine();
    			factoryProvider.createRequiredFactory(materialType).getCupBoard(subMaterial);
    			break;
    		}
    		case "fiber": {
    			System.out.println("give type of fiber ---> pvc or fiber");
    			String subMaterial=s.nextLine();
    			factoryProvider.createRequiredFactory(materialType).getCupBoard(subMaterial);
    			break;
    		}
    		
    		
    		
            }
            
            
            System.out.println("\n\n\n\nDo you still want to stop ?\n then provide material \nif you want to finish give 1.");
        }

    }
}
