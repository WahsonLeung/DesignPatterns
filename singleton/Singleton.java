package com.wahson.patterns.singleton;

/**
 * Created by wahsonleung on 15/3/29.
 * 双重检查加锁，懒加载，并实现线程安全
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                Singleton temp = instance;
                if (temp == null) {
                    /**
                     * java平台内存模型中又一个叫无序写的机制
                     * instance ＝ new Singleton()时做了两个事情：
                     * 1、调用构造方法，创建一个实例
                     * 2、初始化变量instance来应用这个实例
                     * 但是JVM不保证这两步执行的顺序，也就是说有可能在调用构造方法之前，instance已经被设置成非空
                     */
                    synchronized (Singleton.class) {
                        temp = new Singleton();
                    }
                    instance = temp;
                }
            }
        }

        return instance;
    }
}
