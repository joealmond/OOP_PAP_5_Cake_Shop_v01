package com.codecool.service;

import com.codecool.model.cake.Cake;
import com.codecool.model.oven.Oven;
import com.codecool.model.oven.OvenType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CakeShop {
    private final List<Cake> cakes;
    private final List<OvenType> availibleOvens;

    public CakeShop() {
        cakes = new ArrayList<>();
        availibleOvens = new ArrayList<>();
    }

    public double calculateIncome() {
        return cakes.stream()
                .filter(cake -> cake.isFried())
                .mapToDouble(cake -> cake.getPrice())
                .sum();
    }

    private boolean hasOven(Oven ovenToCheck) {
        return availibleOvens.contains(ovenToCheck);
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
        System.out.println("Cake added to Shop..");
    }

    public void addAllCake(List<Cake> cakes) {
        this.cakes.addAll(cakes);
        System.out.println("Cakes added to Shop..");
    }

    public void addOven(Oven oven) {
        availibleOvens.add(oven.getOvenType());
        System.out.println("Oven added to Shop..");
    }

    public void addAllOven(List<Oven> ovens) {
        ovens.stream()
                .map(oven -> oven.getOvenType())
                .forEach(ovenType -> this.availibleOvens.add(ovenType));

        System.out.println("Ovens added to Shop..");
    }

    public void sellCake() {
        List<Cake> fryableCakes = getFryableCakes();
        List<Cake> sellableCakes = getSellableCakes(fryableCakes);
        if (!sellableCakes.isEmpty()) {
            sellableCakes.get(0).setFried();
            System.out.println("Cake fried and selled!");
        } else {
            System.out.println("No cakes to sell!");
        }
    }

    private static List<Cake> getSellableCakes(List<Cake> fryableCakes) {
        List<Cake> sellableCakes = fryableCakes.stream()
                .filter(cake -> !cake.isFried())
                .collect(Collectors.toList());
        return sellableCakes;
    }

    private List<Cake> getFryableCakes() {
        List<Cake> fryableCakes = cakes.stream()
                .filter(cake -> availibleOvens.contains(cake.getOvenNeeded()))
                .collect(Collectors.toList());
        return fryableCakes;
    }

}
