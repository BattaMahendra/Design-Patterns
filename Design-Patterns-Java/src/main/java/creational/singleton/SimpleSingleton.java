package creational.singleton;

public class SimpleSingleton {
	
	//eager instantiation --> object is created the moment class is loaded
	//make the field private so that no one can access it.
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

/*
* The basic Singleton implementation provided has several drawbacks, particularly in multi-threaded environments. Here are some of the main issues:

1. Thread Safety:
Problem: The provided Singleton implementation is not thread-safe. If two threads call getInstance() simultaneously when the instance is null, both could create separate instances, violating the Singleton principle.
Solution: Use synchronized blocks or other thread-safe mechanisms to ensure only one thread can create the instance.
*
2. Performance:
Problem: If you add synchronization to make it thread-safe (e.g., by making getInstance() synchronized), it could lead to performance issues due to the overhead of locking, especially in scenarios where the Singleton instance is frequently accessed.
Solution: Use a more efficient approach like the "Double-Checked Locking" pattern or the "Bill Pugh Singleton" design.
*
3. Serialization:
Problem: If the Singleton class implements Serializable, deserializing the object can create a new instance, breaking the Singleton property.
Solution: Override the readResolve method to ensure that the deserialized object returns the existing Singleton instance.
*
4. Cloning:
Problem: If the Singleton class implements Cloneable, calling clone() can create a new instance.
Solution: Override the clone() method to prevent cloning.
*
5. Global Access:
Problem: Singleton provides a global access point, which can make it harder to track dependencies and can lead to hidden couplings between classes.
Solution: Consider using Dependency Injection to manage the Singleton if global access isn't strictly necessary.
* */
