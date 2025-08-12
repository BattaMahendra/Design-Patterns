package Design.Patterns.creational.abstract_factory.fiber;

import Design.Patterns.creational.abstract_factory.CupBoard;

public abstract class FiberCupBoard implements CupBoard {

static String material ="fiber";
	
	String subMaterial;
	int baseCost=30;
	
	FiberCupBoard(){
		setType();
	}
	@Override
	public void setType() {
		System.out.println("here is ur "+this.material+" cup board");
		
	}

}
