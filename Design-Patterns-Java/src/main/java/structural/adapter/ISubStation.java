package structural.adapter;

/*
 * lets suppose this is the main interface which we want to use.
 * this interface has one method which returns the power based on the client
 * the implementation of this interface returns 11k volts by default
 */
public interface ISubStation {
	
	public Power getPower(String client);

}
