package com.wahson.patterns.factory.abstractfactory;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class Product2Factory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
