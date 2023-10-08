package com.codecool.model.cake;

import com.codecool.model.oven.OvenType;

public class ChimneyCake extends Cake {
    private static final double price = 2;

    public ChimneyCake(Flavour flavour) {
        super(CakeType.CHIMNEYCAKE, flavour, price);
    }

    @Override
    public OvenType getOvenNeeded() {
        return OvenType.CHIMEYCAKEOVEN;
    }
}
