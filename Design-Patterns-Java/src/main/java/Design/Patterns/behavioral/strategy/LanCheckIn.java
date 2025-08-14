package Design.Patterns.behavioral.strategy;


// these are concrete strategies
public class LanCheckIn implements ICheckInType {

	@Override
	public void checkIn(String credentials) {
		System.out.println("Employee Check in with "+this.getClass()+" and credentials : "+ credentials);

	}

}
