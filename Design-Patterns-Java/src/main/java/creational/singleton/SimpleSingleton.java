package creational.singleton;

public class SimpleSingleton {
	
	//eager instantiation --> object is created the moment class is loaded
	private static SimpleSingleton eagerSingletonInstance = new SimpleSingleton();
	
	private SimpleSingleton() {
		
	}
	
	public static SimpleSingleton getInstance() {
		return eagerSingletonInstance;
	}

}
