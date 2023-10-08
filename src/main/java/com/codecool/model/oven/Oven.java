package com.codecool.model.oven;

import com.codecool.model.cake.Cake;

public abstract class Oven implements FryCake {

    private OvenType ovenType;

    public Oven(OvenType ovenType) {
        this.ovenType = ovenType;
    }

    @Override
    public abstract void fryCake(Cake cake);

    public OvenType getOvenType() {
        return ovenType;
    }
}
