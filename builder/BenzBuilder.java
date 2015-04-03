package com.wahson.patterns.builder;

import java.util.ArrayList;

/**
 * Created by wahsonleung on 15/3/31.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    /**
     *
     * @param sequence
     */
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
