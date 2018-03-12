package com.company.meal;

public class Hamburger extends AbstractFood implements TastyFood {

    @Override
    public int energy() {
        return 65;
    }

    @Override
    public String getName() {
        return "hamburger";
    }
}
