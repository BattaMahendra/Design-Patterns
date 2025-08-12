package Design.Patterns.structural.adapter;

public class TransformerLocal implements ITransformer {

	@Override
	public Power transformPowerToIndustry() {
		
		return new Power(430);
	}

	@Override
	public Power transformPowerToHome() {
		
		return new Power(110);
	}

	@Override
	public Power transformPowerToSchool() {
		
		return new Power(230);
	}

}
