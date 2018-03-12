package com.company.meal;

public class Pasta extends AbstractFood implements TastyFood {

    @Override
    public int energy() {
        return 65;
    }

    @Override
    public String getName() {
        return "Pasta with cheese and meat";
    }
}
