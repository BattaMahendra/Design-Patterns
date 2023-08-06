package creational.abstract_factory.object_factories;

import creational.abstract_factory.CupBoard;
import creational.abstract_factory.metal.AluminiumCupbord;
import creational.abstract_factory.metal.SteelCupBoard;
import creational.abstract_factory.wood.HardWoodCupBoard;
import creational.abstract_factory.wood.PlywoodCupbord;

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
