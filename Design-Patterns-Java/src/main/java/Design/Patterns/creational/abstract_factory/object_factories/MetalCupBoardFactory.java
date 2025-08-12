package Design.Patterns.creational.abstract_factory.object_factories;

import Design.Patterns.creational.abstract_factory.CupBoard;
import Design.Patterns.creational.abstract_factory.metal.AluminiumCupbord;
import Design.Patterns.creational.abstract_factory.metal.SteelCupBoard;

public  class MetalCupBoardFactory implements CupBoardFactory {
	
	@Override
	public CupBoard getCupBoard(String materialType) {
		switch(materialType.toLowerCase()){
		
		case "aluminium": return new AluminiumCupbord();
		case "steel": return new SteelCupBoard();
		default: {System.out.println("invalid material"); return null;}
		}
	}

}
