package behavioral.strategy;

import static behavioral.strategy.CheckInType.ACCESS_CARD_CHECK_IN;
public class Client {

    public static void main(String[] args) {

        CheckInWithoutStrategy c = new CheckInWithoutStrategy();
        c.setCheckInType(ACCESS_CARD_CHECK_IN);
        c.checkIn("creds");
    }
}
