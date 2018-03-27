package com.donny.decorate3.beverage;

import com.donny.decorate3.beverage.coffee.DarkRoast;
import com.donny.decorate3.beverage.coffee.Espresso;
import com.donny.decorate3.beverage.coffee.HouseBlend;
import com.donny.decorate3.beverage.condiment.Mocha;
import com.donny.decorate3.beverage.condiment.Soy;
import com.donny.decorate3.beverage.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
//        Beverage espresso = new Espresso();
//        System.out.println(espresso.getDescription() + " $" + espresso.cost());
//
//        Beverage darkRoast = new DarkRoast();
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Whip(darkRoast);
//        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(2);
        houseBlend = new Soy(houseBlend);
//        houseBlend = new Mocha(houseBlend);
//        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
