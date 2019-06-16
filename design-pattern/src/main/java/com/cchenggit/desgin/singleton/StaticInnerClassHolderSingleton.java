package com.cchenggit.desgin.singleton;

/**
 * 静态内部持有类方式，只在调用单例时，内部类才会进行初始化。
 * 最安全有效的方式
 */
public class StaticInnerClassHolderSingleton {
    private StaticInnerClassHolderSingleton(){

    }

    // 加载一个类时，其内部类不会同时被加载,只有在getInstance方法被调用时，才会初始化
    private static class InnerSingletonHolder{
        private static StaticInnerClassHolderSingleton holderSingleton = new StaticInnerClassHolderSingleton();
    }

    public static StaticInnerClassHolderSingleton getInstance(){
        return InnerSingletonHolder.holderSingleton;
    }

}
