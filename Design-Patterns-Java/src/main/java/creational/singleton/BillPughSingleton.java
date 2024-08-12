package creational.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable, Cloneable{
    // Private constructor to prevent instantiation
    private BillPughSingleton() {
        // Initialization code here
    }

    // Static inner class - inner classes are not loaded until they are referenced

    private static class SingletonHelper {
        // The Singleton instance is created only when the SingletonHelper class is loaded

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    //avoid creating new instance while deserializing
    // Ensure that the same instance is returned during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    //avoid cloning of this class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this object is not allowed");
    }

}

 /*
    * Class Loading:

        The JVM guarantees that a class is loaded only once and that the static fields are initialized when the class is loaded.
        The SingletonHelper class is not loaded until it is referenced by the getInstance() method. This ensures that the Singleton instance (SingletonHelper.INSTANCE) is created only when the getInstance() method is first called.
*
      Thread Safety:
        When multiple threads access the getInstance() method simultaneously, the JVM ensures that the static initialization of the SingletonHelper class is done in a thread-safe manner.
        *  This means that even if two threads access getInstance() at the exact same time, the JVM ensures that the SingletonHelper class is loaded only once, and thus, the Singleton instance is created only once.
        The JVM's class loader mechanism provides the necessary synchronization to make this operation thread-safe without requiring explicit synchronization in the code.
*
* */
