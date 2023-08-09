package structural.adapter;
/**
 * This is another interface which has the ability to convert the substation power to our 
 * convenience.
 * 
 * but we don't have the connection link between the ITransformer and ISubstation interface.
 * @author batta.chowdary
 *
 */
public interface ITransformer {
	
	public Power transformPowerToIndustry();
	public Power transformPowerToHome();
	public Power transformPowerToSchool();
	

}
