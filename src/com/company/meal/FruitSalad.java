package com.company.meal;

public class FruitSalad extends AbstractFood implements HealthyFood {

    @Override
    public int energy() {
        return 50;
    }

    @Override
    public String getName() {
        return "Fruit salad";
    }
}
