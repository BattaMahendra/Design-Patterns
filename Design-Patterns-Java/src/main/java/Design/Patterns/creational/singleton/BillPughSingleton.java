package Design.Patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Unlike enum singleton here we have flexibility to extend any other class

/*
* Main issues with Bill Pugh singleton are
* 1. Deserialization issues
* 2. Clonable issues
* 3. Reflection issues
*
* all three disadvantages can be solved by using some techniques*/
public class BillPughSingleton implements Serializable, Cloneable{

    //setting a boolean flag to ensure singleton safety from reflection
    private static boolean instanceCreated = false;

    // Private constructor to prevent instantiation
    private BillPughSingleton() {

        /*
        * Here is the lock and check mechanism to avoid reflection in Bill pugh singleton*/
        if(instanceCreated){
            throw new RuntimeException("Instance already created : use getInstance() method for object");
        }

        // flag is set true once the object is created
        instanceCreated = true;
    }

    // Static inner class - inner classes are not loaded until they are referenced
    /*
    * If two threads call getInstance() at exactly the same time, the JVM ensures that the SingletonHelper class is loaded only once.
    *  The first thread to load the class initializes INSTANCE, and any other thread trying to load it afterward will see the already initialized instance.
    * */
    private static class SingletonHelper {
        // The Singleton instance is created only when the SingletonHelper class is loaded

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the instance
    public static BillPughSingleton getInstance() {

        System.out.println("Creating the Singleton Instance");
        return SingletonHelper.INSTANCE;
    }

   /*
   * Every time deserialization occurs a new instance is created by JVM without calling the constructor
   * The contents of input stream are copied into the new instance by JVM. So the hashcode of the object differs
   * from the original serialized instance.
   *
   * To overcome this we use readResolve() method and we customize the returned object in the method
   * If we provide readResolve() method then JVM takes the returned instance from the method and avoids creating
   * new instance
   *
   * You can practically test it by executing following method from main method
   * */
    protected Object readResolve() {

        // here for the singleton use case we are returning the same instance
        return getInstance();
    }

    /**
     * Cloneable is a marker interface which signals JVM to enable cloning for class it implemented
     * So the Object class contains clone() method which is used to create copies of objects of class
     * Here the clone() method creates object from direct JVM and bypasses constructor totally.
     * */

    //avoid cloning of this class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this object is not allowed"); // you can either prevent cloning
        //return getInstance();   // you can also return the same singleton object which bypasses cloning from JVM
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //serialize
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\batta\\OneDrive\\Documents\\Projects\\SampleProjects\\Design-Patterns\\Design-Patterns-Java\\src\\main\\resources\\serialized-objects.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

        out.writeObject(getInstance());
        out.close();
        fileOutputStream.close();
        System.out.println("Hash code of serialized object: "+ getInstance().hashCode());

        //deserialize
        FileInputStream fin = new FileInputStream("C:\\Users\\batta\\OneDrive\\Documents\\Projects\\SampleProjects\\Design-Patterns\\Design-Patterns-Java\\src\\main\\resources\\serialized-objects.txt");
        ObjectInputStream Oin = new ObjectInputStream(fin);
        BillPughSingleton object = (BillPughSingleton) Oin.readObject();
        System.out.println("Deserialized object hashcode : "+ object.hashCode());


        // Breaking using Reflection

        System.out.println("\n ====== Using REFLECTION TO BREAK BILL PUGH =====");

        Constructor<BillPughSingleton> con = BillPughSingleton.class.getDeclaredConstructor();
        con.setAccessible(true);

        //Creating new object using reflection
        BillPughSingleton instance2 = con.newInstance();

        // Exception will be thrown if we use mechanism
        System.out.println(" Hash code of instance 1 :"+ getInstance().hashCode());
        System.out.println(" Hash code of instance 2 :"+ instance2.hashCode());


    }

}

 /*
    * Class Loading:

        The JVM guarantees that a class is loaded only once and that the static fields are initialized when the class is loaded.
        The SingletonHelper class is not loaded until it is referenced by the getInstance() method. This ensures that the Singleton instance (SingletonHelper.INSTANCE) is created only when the getInstance() method is first called.

    * Thread Safety:

        When multiple threads access the getInstance() method simultaneously, the JVM ensures that the static initialization of the SingletonHelper class is done in a thread-safe manner.
        *  This means that even if two threads access getInstance() at the exact same time, the JVM ensures that the SingletonHelper class is loaded only once, and thus, the Singleton instance is created only once.
        The JVM's class loader mechanism provides the necessary synchronization to make this operation thread-safe without requiring explicit synchronization in the code.
*
* */
