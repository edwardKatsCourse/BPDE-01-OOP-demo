package com.company;

import com.company.meal.AbstractFood;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human[] community = new Human[]{
                new Human(60, "Sarah", "Simons", false),
                new Human(120, "Daniel", "Ivanov", true),
                new Human(75, "Peter", "Simons", false),
                new Human(80, "Howard", "Simons", true)
        };

//        System.out.println(getTastyFood().getName());

        for (int i = 0; i < community.length; i++) {

            System.out.println(String.format(">>>>>>>>>>>> INITIAL ENERGY %s ", community[i].getBaseEnergy()));
            run(community[i]);
            System.out.println(String.format(">>>>>>>>>>>> FINAL ENERGY %s ", community[i].getBaseEnergy()));
            System.out.println("----------------------------------------------------------------------------------------");
        }

    }

    static void run(Human human) {
//        for (int i = 0; i < 100000; i++) {
//            Random random = new Random();
//            int j = random.nextInt(10);
//
//            if (j == 0) {
//
//                System.out.println("0");
//            }
//        }1


        for (int days = 0; days < 10; days++) {
            if (days >= 1) {
                human.nextDay();
            }

            for (int timesToEatPerDay = 0; timesToEatPerDay < 3; timesToEatPerDay++) {

                AbstractFood food;

                if (human.getBaseEnergy() > 400) {
                    System.out.println(String.format("%s %s has started diet", human.getFirstName(), human.getLastName()));
                    food = getHealthyFood();
                } else {
                    food = getRandomFood();
                }

                System.out.println(String.format("%S with energy %s", food.getName(), food.energy()));

                human.doEat(food);
//                System.out.println();
            }

            System.out.println(String.format("%s %s's energy is %s (point) in the end of day %s",
                    human.getFirstName(),
                    human.getLastName(),
                    human.getBaseEnergy(),
                    days + 1));

            System.out.println("*** END DAY ***");
        }

        System.out.println();
        System.out.println(" ////  END OF PERSON TRIAL \\\\\\ ");

    }

    static AbstractFood getRandomFood() {
        Random random = new Random();
        int randomFoodIndex = random.nextInt(AbstractFood.getAllFoodKinds().length);
        return AbstractFood.getAllFoodKinds()[randomFoodIndex];
    }

    static AbstractFood getHealthyFood() {
        Random random = new Random();
        int randomFoodIndex = random.nextInt(AbstractFood.getAllFoodKinds().length);
        AbstractFood abstractFood = AbstractFood.getAllFoodKinds()[randomFoodIndex];

        while (!abstractFood.isHealthy()) {
            return getHealthyFood();
        }

        return abstractFood;
    }

    static AbstractFood getTastyFood() {
        Random random = new Random();
        int randomFoodIndex = random.nextInt(AbstractFood.getAllFoodKinds().length);
        AbstractFood abstractFood = AbstractFood.getAllFoodKinds()[randomFoodIndex];

        while (!abstractFood.isTastyFood()) {
            return getTastyFood();
        }

        return abstractFood;
    }


}
