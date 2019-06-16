package com.cchenggit.desgin.singleton;

public class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton threadSafeLazySingleton;

    /**
     * 这种方式是线程安全，每次获取该单例的时候，都通过synchronized关键字加锁，从而实现了线程安全
     * @return threadSafeLazySingleton
     */
    public static synchronized ThreadSafeLazySingleton getInstance(){
        if (threadSafeLazySingleton == null){
            threadSafeLazySingleton = new ThreadSafeLazySingleton();
        }
        return threadSafeLazySingleton;
    }
}
