package Design.Patterns.creational.abstract_factory.fiber;

public class FiberBoardCupBoard extends FiberCupBoard {

	static int cost=40;

	public FiberBoardCupBoard(){
		super();
		setBaseCost();
	}
	@Override
	public void setBaseCost() {
		this.subMaterial="pvc ";
		System.out.println("cost of the "+this.subMaterial+" cupboard is "+(this.baseCost+this.cost));
	}

}
