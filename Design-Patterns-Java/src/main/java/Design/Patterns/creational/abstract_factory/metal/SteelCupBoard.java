package Design.Patterns.creational.abstract_factory.metal;

public class SteelCupBoard extends MetalCupBoard {

	static int cost=30;
	
	public SteelCupBoard(){
		super();
		setBaseCost();
	}

	@Override
	public void setBaseCost() {
		this.subMaterial="stainless steel ";
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}

}
