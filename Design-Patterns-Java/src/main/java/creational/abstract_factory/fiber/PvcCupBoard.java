package creational.abstract_factory.fiber;

public class PvcCupBoard extends FiberCupBoard {

	static int cost=30;

	public PvcCupBoard(){
		super();
		setBaseCost();
	}
	@Override
	public void setBaseCost() {
		this.subMaterial="pvc ";
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}
}
