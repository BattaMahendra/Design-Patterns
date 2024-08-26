package creational.singleton;

public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton threadSafeSingleton = null;
    
    private ThreadSafeSingleton(){
        
    }

    /**
     * double check locking principle with synchronized block
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
     * this method is accessible by only thread
     */
    public static synchronized ThreadSafeSingleton getInstance2(){


                if(threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }


        return threadSafeSingleton;
    }
    
}
