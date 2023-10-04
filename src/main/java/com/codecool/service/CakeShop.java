package com.codecool.service;

import com.codecool.model.cake.Cake;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CakeShop {
    private final List<Cake> cakes;

    public CakeShop() {
        cakes = new ArrayList<>();
    }

    public double calculateIncome() {
        return cakes.stream()
                .filter(cake -> cake.isFried())
                .mapToDouble(cake->cake.getPrice())
                .sum();
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
        System.out.println("Cake added to Shop..");
    }
    public void addAllCake(List<Cake> cakes) {
        this.cakes.addAll(cakes);
        System.out.println("Cakes added to Shop..");
    }

    public void sellCake() {
        List<Cake> sellableCakes = cakes.stream()
                .filter(cake -> !cake.isFried())
                .collect(Collectors.toList());
        if (!sellableCakes.isEmpty()) {
            sellableCakes.get(0).setFried();
            System.out.println("Cake fried and selled!");
        } else {
            System.out.println("No cakes to sell!");
        }
    }

}
