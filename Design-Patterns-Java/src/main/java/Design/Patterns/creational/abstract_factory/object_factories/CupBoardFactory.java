package Design.Patterns.creational.abstract_factory.object_factories;

import Design.Patterns.creational.abstract_factory.CupBoard;

public interface CupBoardFactory {
	
	public CupBoard getCupBoard(String materialType);

}
