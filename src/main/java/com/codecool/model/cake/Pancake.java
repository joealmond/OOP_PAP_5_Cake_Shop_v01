package com.codecool.model.cake;

import com.codecool.model.oven.OvenType;

public class Pancake extends Cake {
    private static final double price = 1;
    public Pancake(Flavour flavour) {
        super(CakeType.PANCAKE,flavour, price);
    }

    @Override
    public OvenType getOvenNeeded() {
        return OvenType.PANCAKEOVEN;
    }
}
