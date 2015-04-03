package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor(){
        System.out.println("yellow");
    }

    @Override
    public void talk(){
        System.out.println("yellow man says something");
    }
}
