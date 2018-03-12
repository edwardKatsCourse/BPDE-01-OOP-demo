package com.company.meal;

public class MeatSalad extends AbstractFood implements TastyFood {

    @Override
    public int energy() {
        return 55;
    }

    @Override
    public String getName() {
        return "Meat salad";
    }
}
