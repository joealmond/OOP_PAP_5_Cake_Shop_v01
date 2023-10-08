package com.codecool.service;

import com.codecool.model.cake.Cake;
import com.codecool.model.cake.ChimneyCake;
import com.codecool.model.cake.Pancake;
import com.codecool.model.oven.ChimenyCakeOven;
import com.codecool.model.oven.PancakeOven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codecool.model.cake.Flavour.*;
import static org.junit.jupiter.api.Assertions.*;

class CakeShopTest {

    private CakeShop cakeShop;

    @BeforeEach
    void setUp() {
        cakeShop = new CakeShop();
    }

    @Test
    void calculateIncome() {
        // arrange
        Cake strawberryPancakeCake = new Pancake(STRAWBERRY);
        Cake vanilliaPancakeCake = new Pancake(VANILLA);
        Cake chocholatePancakeCake = new Pancake(CHOCOLATE);
        Cake strawberryChimneyCake = new ChimneyCake(STRAWBERRY);
        Cake vanilliaChimneyCake = new ChimneyCake(VANILLA);
        Cake chocholateChimneyCake = new ChimneyCake(CHOCOLATE);

        ChimenyCakeOven chimenyCakeOven = new ChimenyCakeOven();
        PancakeOven pancakeOven = new PancakeOven();

        cakeShop.addAllOven(List.of(chimenyCakeOven,pancakeOven));

        List<Cake> cakes = new ArrayList<>(List.of(
                strawberryChimneyCake,
                strawberryPancakeCake,
                vanilliaChimneyCake,
                vanilliaPancakeCake,
                chocholateChimneyCake,
                chocholatePancakeCake
        ));

        cakeShop.addAllCake(cakes);

        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();

        // act
        double income = cakeShop.calculateIncome();

        // assert
        assertEquals(11.5,income);
    }
}