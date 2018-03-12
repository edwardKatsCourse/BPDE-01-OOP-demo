package com.company.meal;

public class Fish extends AbstractFood implements HealthyFood {

    @Override
    public int energy() {
        return 45;
    }

    @Override
    public String getName() {
        return "Fish";
    }
}
