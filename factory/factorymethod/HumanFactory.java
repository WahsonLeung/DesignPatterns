package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class HumanFactory extends AbstractHumanFactory {

    public <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }
}
