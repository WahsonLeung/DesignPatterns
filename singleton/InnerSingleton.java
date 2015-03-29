package com.wahson.patterns.singleton;

/**
 * Created by wahsonleung on 15/3/29.
 * 实现单例模式，使用内部类方式，使用懒汉模式，并且保证线程安全
 */
public class InnerSingleton {
    private static class SingletonHolder{
        public static InnerSingleton instance = new InnerSingleton();
    }

    private InnerSingleton(){
    }

    public static InnerSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
