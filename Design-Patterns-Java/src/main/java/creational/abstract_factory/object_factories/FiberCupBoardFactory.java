package creational.abstract_factory.object_factories;

import creational.abstract_factory.CupBoard;
import creational.abstract_factory.fiber.FiberBoardCupBoard;
import creational.abstract_factory.fiber.PvcCupBoard;
import creational.abstract_factory.metal.AluminiumCupbord;
import creational.abstract_factory.metal.SteelCupBoard;

public  class FiberCupBoardFactory implements CupBoardFactory {

	@Override
	public CupBoard getCupBoard(String materialType) {
		switch(materialType.toLowerCase()){
		
		case "pvc": return new PvcCupBoard();
		case "fiber": return new FiberBoardCupBoard();
		default: {System.out.println("invalid material"); return null;}
		}

}
}