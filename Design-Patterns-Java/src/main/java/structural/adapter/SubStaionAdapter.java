package structural.adapter;
/**
 * Here we have used the transformer functionality inside as a object and then we are manipulatin 
 * the substation method.
 * @author batta.chowdary
 *
 */
public class SubStaionAdapter implements ISubStation{
	
	private TransformerLocal transformer;

	@Override
	public Power getPower(String client) {
		transformer = new TransformerLocal();
		switch(client.toLowerCase()) {
		
		case "home": return  transformer.transformPowerToHome();
		case "industry": return transformer.transformPowerToIndustry();
		case "school": return transformer.transformPowerToSchool();
		}
		return new Power(0);
		
	}

}
