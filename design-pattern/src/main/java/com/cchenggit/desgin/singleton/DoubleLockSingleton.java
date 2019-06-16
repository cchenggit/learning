package com.cchenggit.desgin.singleton;

/**
 * 双重加锁模式，优于单加锁模式
 */
public class DoubleLockSingleton {

    // 通过 volatile 关键字，避免了初始化过程中，指令重排序造成初始化一半的情况。
    private static volatile DoubleLockSingleton doubleLockSingleton;

    public static DoubleLockSingleton getInstance() {
        if (doubleLockSingleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (doubleLockSingleton == null)
                    doubleLockSingleton = new DoubleLockSingleton();
            }
        }
        return doubleLockSingleton;
    }
}
