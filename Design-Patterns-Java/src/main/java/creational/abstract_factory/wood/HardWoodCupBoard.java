package creational.abstract_factory.wood;

public class HardWoodCupBoard extends WoodenCupBoard {

	static int cost=10;
	
	public HardWoodCupBoard(){
		super();
		setBaseCost();
	}

	@Override
	public void setBaseCost() {
		this.subMaterial="hardwood";
		System.out.println("here is ur "+this.subMaterial+" "+material+" cup board");
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}

}
