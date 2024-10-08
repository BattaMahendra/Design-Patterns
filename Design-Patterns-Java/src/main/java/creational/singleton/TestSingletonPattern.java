package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.util.concurrent.CountDownLatch;


public class TestSingletonPattern extends Thread {

    private CountDownLatch latch;

    public TestSingletonPattern(String name, CountDownLatch latch) {
        this.latch = latch;
        setName(name);
    }

    public TestSingletonPattern() {

    }

    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //intializeLazySingleton();

      //  simpleSingletonTesting();
    	
    	

        multipleThreadsAccessingSingleton();

        Thread.sleep(500);

        //breaking singleton using reflection

        Constructor<ThreadSafeSingleton> constructor = ThreadSafeSingleton.class.getDeclaredConstructor();

        // Set the constructor accessible to bypass the private modifier
        constructor.setAccessible(true);

        // Create a new instance using the constructor
        ThreadSafeSingleton newInstance = constructor.newInstance();

        // Output the hash codes to show different instances
        System.out.println("Instance One: " + ThreadSafeSingleton.getInstance().hashCode());
        System.out.println("Instance Two: " + newInstance.hashCode());

        //we can avoid reflection by using enum singleton or using static boolean flag
        //implemented in BillPughSingleton class.
    	


    }

    private static void testEnumSingletonDesign() {
        EnumSingleton enumSingleton = EnumSingleton.ENUM_SINGLETON;
        System.out.println("The hash code  of the enumSingleton object is : "+ enumSingleton.hashCode());
    }

    private static void getThreadSafeSingletonInstance() {
        ThreadSafeSingleton obj =ThreadSafeSingleton.getInstance();
        System.out.println("The hashcode of thread safe singleton class : "+obj.hashCode());
    }

    /**
     * creating multithread mechanism to make two threads running at same time
     * although two threads can not be started at the same time
     * we start both of them at different times and block them for while and
     * resume them at the same time by using CountDownLatch object
     * so this gives us two threads running practically at the same time
     */
    private static void multipleThreadsAccessingSingleton() throws InterruptedException {
        //creating count down with 1
        CountDownLatch latch = new CountDownLatch(1);

        //creating multiple threads at once and starting them individually
        TestSingletonPattern t1 = new TestSingletonPattern("Thread 1", latch);
        TestSingletonPattern t2 = new TestSingletonPattern("Thread 2", latch);
        t1.start();
        t2.start();

        //run method is called automatically when we call start() method for a thread
        //now all the threads are started and we blocked them purposefully ( go to run method)

        System.out.println("-----------------------------------------------");
        System.out.println(" Now release the latch: with thread");
        System.out.println("-----------------------------------------------");
        //counting down the latch from 1 to 0
        latch.countDown();
    }

    /**
     * Lazy initialization of singleton class
     */
    private static void intializeLazySingleton() {
        System.out.println("\n \nimplementing Lazy Singleton Method");
        TestSingletonPattern t1 = new TestSingletonPattern();
        TestSingletonPattern t2 = new TestSingletonPattern();
        TestSingletonPattern t3 = new TestSingletonPattern();
        TestSingletonPattern t4 = new TestSingletonPattern();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        LazySingleton obj3 = LazySingleton.getInstance();
        System.out.println("hashcode of obj1 : " + obj1.hashCode());
        System.out.println("hashcode of obj2 : " + obj2.hashCode());
        System.out.println("hashcode of obj3 : " + obj3.hashCode());
    }

    /**
     * eager instantiation
     */
    private static void simpleSingletonTesting() {
        System.out.println("\n implementing eager Singleton Method");
        SimpleSingleton obj1 = SimpleSingleton.getInstance();
        SimpleSingleton obj2 = SimpleSingleton.getInstance();
        SimpleSingleton obj3 = SimpleSingleton.getInstance();
        System.out.println("hashcode of obj1 : " + obj1.hashCode());
        System.out.println("hashcode of obj2 : " + obj2.hashCode());
        System.out.println("hashcode of obj3 : " + obj3.hashCode());
    }


    /**
     * The moment a thread is called with start() method , this run() method is triggered
     * it is triggered for every thread
     */
    @Override
    public void run() {
        try {
            System.out.printf("[ %s ] created, blocked by the latch...\n", getName());
            //all threads are created and blocked here untill latch count down method happens
            latch.await();
            //the moment count down completes the threads are all released from blocked state to active
            //which means even though all threads are not created at once, but they are blocked and released
            //at same time which makes every thread to act simultaneously
            System.out.printf("[ %s ] starts at: %s\n", getName(), Instant.now());
           
            // do actual work here...
            //creation of singleton object
            //three threads access it at same time
            //callingLazyInstance();
            getThreadSafeSingletonInstance();
//            testEnumSingletonDesign();

        } catch (InterruptedException e) {
            // handle exception
        }

    }

    /**
     * @throws InterruptedException 
     *
     */
    private void callingLazyInstance() {
    	
        LazySingleton obj1 = LazySingleton.getInstance();
        System.out.println("hashcode of obj1 : " + obj1.hashCode());
    }

}
