package com.company.meal;

public class Salad extends AbstractFood implements HealthyFood {

    @Override
    public int energy() {
        return 35;
    }

    @Override
    public String getName() {
        return "Salad";
    }
}
