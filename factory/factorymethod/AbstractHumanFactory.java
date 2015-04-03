package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
