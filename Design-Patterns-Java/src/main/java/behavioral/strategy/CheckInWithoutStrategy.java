package behavioral.strategy;

public class CheckInWithoutStrategy {

    private CheckInType checkInType;

    public void setCheckInType(CheckInType checkInType) {
        this.checkInType = checkInType;
    }

    /**
     * The problem with this code is it violates OPEN-CLOSED principle from SOLID approach
     * it states that code should be open for extension and closed for modification
     *
     * let's suppose we added new check in type in enum in future
     * when we want to implement that in following checkIn method we need to add
     * one more elseif condition , which means modifying the checkIn method and it
     * directly violates the OPEN-CLOSED principle
     *
     * The solution is we should decouple the CheckInTypes logic  from this method
     * 
     * which mean even if we add more authentication methods in future the checkIn method
     * should not be modified. It should be compatible enough to handle any newly added
     * strategies(for eg: ManagerRegularisation)
     *
     *
     * @param credentials
     */
    public  void checkIn(String credentials){

      if(checkInType == CheckInType.ACCESS_CARD_CHECK_IN){
          System.out.println("Check in with access card and credentials : "+ credentials);
      }else if(checkInType == CheckInType.LAN_CHECK_IN){
          System.out.println("Check in with "+CheckInType.LAN_CHECK_IN+" and credentials : "+ credentials);
      }else if(checkInType == CheckInType.WORK_FROM_HOME){
          System.out.println("Check in with "+CheckInType.WORK_FROM_HOME+" and credentials : "+ credentials);
      }else{
          throw new IllegalArgumentException("Invalid check in ");
      }

    }
}

/**
 * This enum contains type of all check in strategies available
 * we can add more strategies into this if required
 * this is a scalable approach using enum
 */
 enum CheckInType{
    ACCESS_CARD_CHECK_IN,
     LAN_CHECK_IN,
     WORK_FROM_HOME,
     MANAGER_REGULARISATION
}
