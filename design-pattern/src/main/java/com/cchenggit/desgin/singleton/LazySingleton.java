package com.cchenggit.desgin.singleton;

/**
 * 单例模式之懒汉模式，是指在单例在需要使用时，才生成单例的方式。
 * 懒汉模式的特点是，在类加载时，不对单例进行初始化，只有第一次调用getInstance方法时，才会创建该实例。
 *
 * 因此懒汉单例模式，还分线程安全和线程不完全.
 *
 * 此处例子是线程不安全的
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
