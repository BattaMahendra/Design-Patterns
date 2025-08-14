package Design.Patterns.behavioral.strategy;

import static Design.Patterns.behavioral.strategy.CheckInType.ACCESS_CARD_CHECK_IN;
public class Client {

    public static void main(String[] args) {

    	System.out.println("\n\t\t =====================Without using strategy pattern =======================\n");
        withOutStrategy();
        
        System.out.println("\n\n\t\t ======================== With using strategy pattern =======================\n");
        withStrategyPattern();
        
        System.out.println("\n\t\t ===========================Without using strategy pattern and JAVA 8 =======================\n");
        withStrategyAndJava8();
        	
        
    }

	private static void withStrategyAndJava8() {
		EmployeeContext context1 = new EmployeeContext(EmployeeContext.accCard);
        context1.checkIn("creds");
        
        EmployeeContext context2 = new EmployeeContext(EmployeeContext.wfh);
        context1.checkIn("creds");
        
	}

	private static void withStrategyPattern() {
		AccessCard accessCard = new AccessCard();
        EmployeeContext context = new EmployeeContext(accessCard);
        context.checkIn("creds");

        //changing strategy at runtime
        context.setCheckInType(new WFH());
        context.checkIn("creds");
        
        LanCheckIn lan = new LanCheckIn();
        EmployeeContext context2 = new EmployeeContext(lan);
        context2.checkIn("creds");
	}

	private static void withOutStrategy() {
		CheckInWithoutStrategy c = new CheckInWithoutStrategy();
        c.setCheckInType(ACCESS_CARD_CHECK_IN);
        c.checkIn("creds");
        
	}
}
