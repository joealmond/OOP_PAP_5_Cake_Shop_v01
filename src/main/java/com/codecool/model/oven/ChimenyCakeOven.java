package com.codecool.model.oven;

import com.codecool.model.cake.Cake;

public class ChimenyCakeOven extends Oven implements FryCake {
    public ChimenyCakeOven() {
        super(OvenType.CHIMEYCAKEOVEN);
    }

    @Override
    public void fryCake(Cake cake) {
        cake.setFried();
        System.out.println("Cake fried..");
    }
}
