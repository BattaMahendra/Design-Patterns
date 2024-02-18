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


// our class should let us create only one obj
// and that should be used everywhere

// we want our obj to be created only when we need it.
