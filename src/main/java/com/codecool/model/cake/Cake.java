package com.codecool.model.cake;

public class Cake {
    CakeType cakeType;
    Flavour flavour;
    double price;


    boolean isFried;


    public Cake(Flavour flavour, double price) {
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
}
