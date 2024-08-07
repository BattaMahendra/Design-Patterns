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

        if(threadSafeSingleton == null){

            synchronized (ThreadSafeSingleton.class){

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
