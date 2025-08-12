package Design.Patterns.creational.abstract_factory.metal;

import Design.Patterns.creational.abstract_factory.CupBoard;

public abstract class MetalCupBoard implements CupBoard {
	
	static String material ="metal";
	
	String subMaterial;
	int baseCost=20;
	
	MetalCupBoard(){
		setType();
	}
	@Override
	public void setType() {
		System.out.println("here is ur  "+material+" cup board");
		
	}

}
