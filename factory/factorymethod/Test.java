package com.wahson.patterns.factory.factorymethod;

/**
 * Created by wahsonleung on 15/3/30.
 */
public class Test {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        Human blackHuman = factory.createHuman(BlackHuman.class);
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        Human yellowHuamn = factory.createHuman(YellowHuman.class);

        humanDoSth(blackHuman);
        humanDoSth(whiteHuman);
        humanDoSth(yellowHuamn);
    }

    public static void humanDoSth(Human human){
        human.getColor();
        human.talk();
    }
}
