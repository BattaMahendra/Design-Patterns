package structural.adapter;

public class SubStaionLocal implements ISubStation {

	@Override
	public Power getPower(String client) {
		
		return new Power(11000);
	}

}
