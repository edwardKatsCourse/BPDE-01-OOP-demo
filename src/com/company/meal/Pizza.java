package com.company.meal;

public class Pizza extends AbstractFood implements TastyFood {

    @Override
    public int energy() {
        return 80;
    }

    @Override
    public String getName() {
        return "pizza";
    }
}
