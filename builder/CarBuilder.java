package com.wahson.patterns.builder;

import java.util.ArrayList;

/**
 * Created by wahsonleung on 15/3/31.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
