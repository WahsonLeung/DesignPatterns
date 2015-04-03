package com.wahson.patterns.builder;

/**
 * Created by wahsonleung on 15/3/31.
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("BMW start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW start");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW start");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW start");
    }
}
