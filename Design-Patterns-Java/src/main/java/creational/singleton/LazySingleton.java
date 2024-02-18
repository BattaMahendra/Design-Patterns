package creational.singleton;

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
		
		
		if(lazyInstance == null) {
			lazyInstance= new LazySingleton();
			return lazyInstance;
		}
		
		return lazyInstance;
		
	}

	

}
