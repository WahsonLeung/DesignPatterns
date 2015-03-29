package com.wahson.patterns.singleton;

/**
 * Created by wahsonleung on 15/3/29.
 * 饿汉模式（非懒加载）实现单例模式，保证线程安全，但是如果单例很大，构造完又迟迟没有使用，会导致资源浪费
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
