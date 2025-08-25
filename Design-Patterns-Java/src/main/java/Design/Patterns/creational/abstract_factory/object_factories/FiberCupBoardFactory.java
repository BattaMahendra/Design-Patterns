package Design.Patterns.creational.abstract_factory.object_factories;

import Design.Patterns.creational.abstract_factory.CupBoard;
import Design.Patterns.creational.abstract_factory.fiber.FiberBoardCupBoard;
import Design.Patterns.creational.abstract_factory.fiber.PvcCupBoard;

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