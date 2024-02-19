package behavioral.strategy;

import static behavioral.strategy.CheckInType.ACCESS_CARD_CHECK_IN;
public class Client {

    public static void main(String[] args) {

    	System.out.println("\n Without using strategy pattern \n");
        withOutStrategy();
        
        System.out.println("\n\n With using strategy pattern \n");
        withStrategyPattern();
        
        System.out.println("\n Without using strategy pattern and JAVA 8 \n");
        withStrategyAndJava8();
        	
        
    }

	private static void withStrategyAndJava8() {
		Context context1 = new Context(Context.accCard);
        context1.checkIn("creds");
        
        Context context2 = new Context(Context.wfh);
        context1.checkIn("creds");
        
	}

	private static void withStrategyPattern() {
		AccessCard accessCard = new AccessCard();
        Context context = new Context(accessCard);
        context.checkIn("creds");
        
        LanCheckIn lan = new LanCheckIn();
        Context context2 = new Context(lan);
        context2.checkIn("creds");
	}

	private static void withOutStrategy() {
		CheckInWithoutStrategy c = new CheckInWithoutStrategy();
        c.setCheckInType(ACCESS_CARD_CHECK_IN);
        c.checkIn("creds");
        
	}
}
