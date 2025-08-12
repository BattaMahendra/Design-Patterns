package Design.Patterns.creational.abstract_factory.wood;

import Design.Patterns.creational.abstract_factory.CupBoard;

public abstract class WoodenCupBoard implements CupBoard{
	
	static String material ="wood";
	String subMaterial;
	int baseCost=10;
	
	WoodenCupBoard(){
		setType();
	}
	@Override
	public void setType() {
		System.out.println("here is ur  "+material+" cup board");
		
	}
	
	

}
