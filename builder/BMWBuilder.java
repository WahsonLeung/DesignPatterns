package com.wahson.patterns.builder;

import java.util.ArrayList;

/**
 * Created by wahsonleung on 15/3/31.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
