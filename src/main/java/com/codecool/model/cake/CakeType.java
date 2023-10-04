package com.codecool.model.cake;

public enum CakeType {
    PANCAKE(1),
    CHIMNEYCAKE(2);

    final double price;

    CakeType(double price) {
        this.price = price;
    }
}
