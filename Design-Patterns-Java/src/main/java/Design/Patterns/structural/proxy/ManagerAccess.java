package Design.Patterns.structural.proxy;
/**
 * this is the real access which have access to all rooms in odc
 * but we will implement another proxy access and will remove access to some rooms
 * 
 * @author batta.chowdary
 *
 */
public class ManagerAccess implements IOdcAccess {

	@Override
	public void grantAccess(String rooms) {
		System.out.println("you have access to all rooms");

	}

}
