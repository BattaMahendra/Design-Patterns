package Design.Patterns.behavioral.strategy;

public class EmployeeContext {
	
	private ICheckInType checkInType;
	
	/*
	 * Here we loosely coupled strategies so that this can need not
	 * be changed in future even if we add one more check in strategy
	 * we just need to make sure that new strategy must implement the interface
	 */
	
	public EmployeeContext(ICheckInType checkInType) {
		this.checkInType=checkInType;
	}
	
	public void checkIn(String creds) {
		checkInType.checkIn(creds);
	}

	//introducing setter to change the checkin strategy at run time
	public void setCheckInType(ICheckInType checkInStrategy){
		this.checkInType = checkInStrategy;
	}

	
	/*
	 * Leveraging JAVA 8
	 * 
	 * instead of creating sub classes of ICheckInType 
	 * we can also use the functional interface lambdas 
	 * this reduces creation of classes and all those redundant code
	 */
	static ICheckInType accCard = (String creds) -> System.out.println("check in with access card with creds :"+creds); 
	static ICheckInType lan = (String creds) -> System.out.println("check in with LAN with creds :"+creds); 
	static ICheckInType wfh = (String creds) -> System.out.println("check in with WFH with creds :"+creds); 
}

