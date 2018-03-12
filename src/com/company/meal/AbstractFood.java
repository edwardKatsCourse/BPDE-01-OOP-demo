package com.company.meal;

public abstract class AbstractFood {
    public abstract int energy();
    public abstract String getName();

    public static AbstractFood[] getAllFoodKinds() {
        AbstractFood[] abstractFoods = {
                new Fish(),
                new FruitSalad(),
                new Hamburger(),
                new MeatSalad(),
                new Pizza(),
                new Pasta(),
                new Salad()
        };
        return abstractFoods;
    }

    public boolean isHealthy() {
        return this instanceof HealthyFood;
    }

    public boolean isTastyFood() {
        return this instanceof TastyFood;
    }
}
