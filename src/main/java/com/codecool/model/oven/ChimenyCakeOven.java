package com.codecool.model.oven;

import com.codecool.model.cake.Cake;

public class ChimenyCakeOven implements FryCake {
    @Override
    public void fryCake(Cake cake) {
        cake.setFried();
        System.out.println("Cake fried..");
    }
}
