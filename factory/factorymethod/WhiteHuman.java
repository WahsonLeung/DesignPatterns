package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor(){
        System.out.println("white");
    }

    @Override
    public void talk(){
        System.out.println("white man says something");
    }
}
