package Design.Patterns.structural.proxy;

public class PorxyTest {
	public static void main(String[] args) {
		DeveloperAccessProxy access = new DeveloperAccessProxy();
		access.grantAccess("testing-lab");
		access.grantAccess("general odc");
	}

}
