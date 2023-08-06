package creational.abstract_factory.object_factories;

import creational.abstract_factory.CupBoard;
import creational.abstract_factory.wood.HardWoodCupBoard;
import creational.abstract_factory.wood.PlywoodCupbord;

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
