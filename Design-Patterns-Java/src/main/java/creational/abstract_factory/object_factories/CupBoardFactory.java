package creational.abstract_factory.object_factories;

import creational.abstract_factory.CupBoard;

public interface CupBoardFactory {
	
	public CupBoard getCupBoard(String materialType);

}
