package structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * this is the proxy access , it also implements the ODC access interface 
 * but it has some restrictions in it.
 * @author batta.chowdary
 *
 */
public class DeveloperAccessProxy implements IOdcAccess{

	private ManagerAccess originalAccess;
	private List<String> roomsList = Arrays.asList("testing-lab","AI-lab","ML-lab");
	@Override
	public void grantAccess(String rooms) {
		originalAccess= new ManagerAccess();
		if(roomsList.contains(rooms)) {
			System.out.println("you don't have access to this rooms");
		}
		else originalAccess.grantAccess(rooms);
		
	}
	

}
