package Design.Patterns.creational.abstract_factory.object_factories;

import Design.Patterns.creational.abstract_factory.CupBoard;
import Design.Patterns.creational.abstract_factory.wood.HardWoodCupBoard;
import Design.Patterns.creational.abstract_factory.wood.PlywoodCupbord;

public  class WoodenCupBoardFactory implements CupBoardFactory {

	@Override
	public CupBoard getCupBoard(String materialType) {
		switch(materialType.toLowerCase()){
		
		case "hard": return new HardWoodCupBoard();
		case "plywood": return new PlywoodCupbord();
		default: {System.out.println("invalid material"); return null;}
		}
	}

}
