package creational.abstract_factory.metal;

public class AluminiumCupbord extends MetalCupBoard {
	
	static int cost=30;

	public AluminiumCupbord(){
		super();
		setBaseCost();
	}
	@Override
	public void setBaseCost() {
		this.subMaterial="aluminium";
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}

}
