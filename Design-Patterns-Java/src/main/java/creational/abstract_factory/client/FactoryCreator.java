package creational.abstract_factory.client;

import creational.abstract_factory.CupBoard;
import creational.abstract_factory.object_factories.CupBoardFactory;
import creational.abstract_factory.object_factories.FiberCupBoardFactory;
import creational.abstract_factory.object_factories.MetalCupBoardFactory;
import creational.abstract_factory.object_factories.WoodenCupBoardFactory;

public  class FactoryCreator  {

	public CupBoardFactory createRequiredFactory(String material) {
		
		switch(material.toLowerCase()) {
			
		case "wood": return new WoodenCupBoardFactory() ;
		case "metal": return new MetalCupBoardFactory() ;
		case "fiber": return new FiberCupBoardFactory() ;
		default: return new WoodenCupBoardFactory();
		
		}
	}

}
