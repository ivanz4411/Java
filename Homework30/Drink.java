package ru.mirea.lab1.Homework30;

import ru.mirea.lab1.Homework3.Homework3_6.Test;

public class Drink extends MenuItem implements Alcoholable{

    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description) {
        super(cost, name, description);
    }


    public DrinkTypeEnum getType() {

        return type;
    }

    @Override
    public void isAlcoholicDrink() {

    }

    @Override
    public double getAlcoholVol() {

        return alcoholVol;
    }
}
