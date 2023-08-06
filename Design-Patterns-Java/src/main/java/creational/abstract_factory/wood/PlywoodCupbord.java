package creational.abstract_factory.wood;

public class PlywoodCupbord extends WoodenCupBoard {
	
	static int cost=10;

	public PlywoodCupbord(){
		super();
		setBaseCost();
	}
	@Override
	public void setBaseCost() {
		this.subMaterial="plywood";
		System.out.println("here is ur "+this.subMaterial+" "+material+" cup board");
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}

}
