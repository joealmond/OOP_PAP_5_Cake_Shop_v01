package com.codecool.model.cake;

import com.codecool.model.oven.Oven;
import com.codecool.model.oven.OvenType;

public abstract class Cake {
    CakeType cakeType;
    Flavour flavour;
    double price;
    boolean isFried;

    public Cake(CakeType cakeType, Flavour flavour, double price) {
        this.cakeType = cakeType;
        this.flavour = flavour;
        this.price = price;
        this.isFried = false;
    }

    public boolean isFried() {
        return isFried;
    }

    public void setFried() {
        isFried = true;
    }

    public double getPrice() {
        return price + flavour.cent;
    }

    public abstract OvenType getOvenNeeded();

}
