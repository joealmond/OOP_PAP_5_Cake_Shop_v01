package com.codecool;

import com.codecool.model.cake.Cake;
import com.codecool.model.cake.ChimneyCake;
import com.codecool.model.cake.Pancake;
import com.codecool.model.oven.ChimenyCakeOven;
import com.codecool.model.oven.Oven;
import com.codecool.model.oven.PancakeOven;
import com.codecool.service.CakeShop;

import java.util.List;

import static com.codecool.model.cake.Flavour.*;

public class Main {
    public static void main(String[] args) {
        CakeShop cakeShop = new CakeShop();

        Cake pancake1 = new Pancake(STRAWBERRY);
        Cake pancake2 = new Pancake(VANILLA);
        Cake chimneyCake1 = new ChimneyCake(CHOCOLATE);
        Cake chimneyCake2 = new ChimneyCake(VANILLA);

        Oven chimenyCakeOven = new ChimenyCakeOven();
        Oven pancakeOven = new PancakeOven();

        cakeShop.addAllOven(List.of(chimenyCakeOven,pancakeOven));
//        cakeShop.addAllOven(List.of(chimenyCakeOven));

        cakeShop.addAllCake(List.of(pancake1,pancake2,chimneyCake1,chimneyCake2));

        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();
        cakeShop.sellCake();


        System.out.println(" ");
        System.out.print("The income of the Cake Shop: ");
        System.out.print(cakeShop.calculateIncome());
        System.out.println("Euro");

    }
}