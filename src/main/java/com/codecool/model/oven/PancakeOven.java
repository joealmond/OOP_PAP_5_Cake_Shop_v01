package com.codecool.model.oven;

import com.codecool.model.cake.Cake;
import com.codecool.model.cake.Pancake;

public class PancakeOven extends Oven implements FryCake {
    private double oilLevelPercent;

    public PancakeOven() {
        super(OvenType.PANCAKEOVEN);
        this.oilLevelPercent = 100;
    }

    @Override
    public void fryCake(Cake cake) {
        oilLevelPercent = oilLevelPercent - 5;
        cake.setFried();
        System.out.println("Cake fried..");
        System.out.println("Consumed 5%-of oil..");
    }
}
