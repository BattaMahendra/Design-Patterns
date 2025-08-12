package Design.Patterns.creational.singleton;

public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton threadSafeSingleton = null;
    
    private ThreadSafeSingleton(){
        
    }

    /**
     * double check locking principle with synchronized block
     * Here we use two checks for the object which gives us the name
     * @return
     */
    public static ThreadSafeSingleton getInstance(){

        //Purpose: The first if statement is used to avoid the cost of synchronization if the singleton instance has already been created.
        if(threadSafeSingleton == null){

            synchronized (ThreadSafeSingleton.class){

                // useful to check whether object is already created when 2 simultaneous threads already entered the first if statement
                if(threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }

    /**
     * this method is accessible by only thread but it is resource intensive as we are using synchronised keyword
     */
    public static synchronized ThreadSafeSingleton getInstance2(){


                if(threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }


        return threadSafeSingleton;
    }
    
}
