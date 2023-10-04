package com.codecool.model.cake;

public enum Flavour {
    VANILLA (0.30),
    CHOCOLATE (0.40),
    STRAWBERRY (0.55);

    final double cent;

    Flavour(double cent) {
        this.cent = cent;
    }
}
