package com.cchenggit.desgin.singleton;


/**
 * 单例模式之饿汉模式
 *
 * 饿汉模式是指在类加载之初就创建该类的实例，并提供对外访问的接口
 *
 * 模式的特点是类一旦加载就创建一个单例，采用 static final关键字修饰，表示在类创建好的同时就会实例化好的，以后不会再变，所以是线程安全的。
 *
 * 但是它有一定的缺陷，那就是在一开始并不是所有的单例类都会被用到，这就导致会浪费一定的空间创建这些单例。
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
