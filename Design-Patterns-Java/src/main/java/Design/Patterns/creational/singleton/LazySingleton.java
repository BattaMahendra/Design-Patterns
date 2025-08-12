package Design.Patterns.creational.singleton;

public class LazySingleton {
	
	private static LazySingleton lazyInstance;
	
	private LazySingleton() {
		
	}

	/**
	 *
	 * this is lazy instantiation
	 * object is created only when getInstance() method is called
	 */
	public  static LazySingleton getInstance() {
		
		
		if(lazyInstance == null) {  // if two threads get here at the same time then it breaks
			lazyInstance= new LazySingleton();
			return lazyInstance;
		}
		
		return lazyInstance;
		
	}

	

}
