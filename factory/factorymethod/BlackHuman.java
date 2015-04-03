package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor(){
        System.out.println("black");
    }

    @Override
    public void talk(){
        System.out.println("black man says something");
    }
}
