package Design.Patterns.behavioral.strategy;

public class AccessCard implements ICheckInType {

	@Override
	public void checkIn(String credentials) {
		 System.out.println("Employee Check in with "+this.getClass()+" and credentials : "+ credentials);

	}

}
