package com.wahson.patterns.builder;

/**
 * Created by wahsonleung on 15/3/31.
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        for (int i = 0; i < 5; i++) {
            director.getABenzModel().run();
        }

        for (int i = 0; i < 5; i++) {
            director.getABMWModel().run();
        }

        for (int i = 0; i < 5; i++) {
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 5; i++) {
            director.getBBMWModel().run();
        }
    }
}
