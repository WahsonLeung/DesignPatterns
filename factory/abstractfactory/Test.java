package com.wahson.patterns.factory.abstractfactory;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Product1Factory();
        AbstractFactory factory2 = new Product2Factory();

        AbstractProductA a1 = factory1.createProductA();
        AbstractProductB b1 = factory1.createProductB();

        AbstractProductA a2 = factory2.createProductA();
        AbstractProductB b2 = factory2.createProductB();

        a1.doSomething();
        b1.doSomething();
        a2.doSomething();
        b2.doSomething();

    }
}
