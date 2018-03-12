package com.company;

import com.company.meal.AbstractFood;

public class Human {

    private static final int DAY_ENERGY_LOSS;

    private int baseEnergy;
    private String firstName;
    private String lastName;
    private boolean hasIntensiveLife;

    public Human(int baseEnergy, String firstName, String lastName, boolean hasIntensiveLife) {
        this.baseEnergy = baseEnergy;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasIntensiveLife = hasIntensiveLife;

//        System.out.println("regular constructor");
//        DAY_ENERGY_LOSS = 1;
    }



    static {
        DAY_ENERGY_LOSS = 130;
    }



    public int getBaseEnergy() {
        return baseEnergy;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void doEat(AbstractFood abstractFood) {
        this.baseEnergy += abstractFood.energy();
        //same as
//        this.baseEnergy = this.baseEnergy + abstractFood.energy();
    }

    public void nextDay() {
        int finalDayEnergyLoss = hasIntensiveLife ? DAY_ENERGY_LOSS + 25 : DAY_ENERGY_LOSS;

//        if (hasIntensiveLife) {
//            finalDayEnergyLoss = DAY_ENERGY_LOSS + 10;
//        } else {
//            finalDayEnergyLoss = DAY_ENERGY_LOSS;
//        }

        this.baseEnergy = this.baseEnergy - finalDayEnergyLoss;

        if (this.baseEnergy <= 0) {
            throw new IllegalArgumentException(String.format("%s %s died",
                    this.firstName,
                    this.lastName));
        }
    }

}


class Parent {
    String a() {
        return "Parent";
    }
}

class Child extends Parent {
    protected String a() {
        return "Child";
    }
}

class GrandChild extends Child {
    public String a() {
        return "GrandChild";
    }
}

class Demo {
    public static void main(String[] args) {

        new Parent().a();
        new Child().a();
        new GrandChild().a();
        //*****************
        z(new GrandChild());

//        z(new String());
    }

    private static void z(Parent p) {
        System.out.println(p.a());
    }
}





