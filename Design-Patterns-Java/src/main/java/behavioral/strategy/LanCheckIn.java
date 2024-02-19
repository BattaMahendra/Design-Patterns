package behavioral.strategy;

public class LanCheckIn implements ICheckInType {

	@Override
	public void checkIn(String credentials) {
		System.out.println("Check in with "+this.getClass()+" and credentials : "+ credentials);

	}

}
