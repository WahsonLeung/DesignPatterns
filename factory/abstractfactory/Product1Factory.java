package com.wahson.patterns.factory.abstractfactory;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class Product1Factory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
