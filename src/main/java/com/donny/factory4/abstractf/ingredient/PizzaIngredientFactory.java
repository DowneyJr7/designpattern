package com.donny.factory4.abstractf.ingredient;

import com.donny.factory4.abstractf.ingredient.cheese.Cheese;
import com.donny.factory4.abstractf.ingredient.clams.Clams;
import com.donny.factory4.abstractf.ingredient.dough.Dough;
import com.donny.factory4.abstractf.ingredient.pepperoni.Pepperoni;
import com.donny.factory4.abstractf.ingredient.sauce.Sauce;
import com.donny.factory4.abstractf.ingredient.veggies.Veggies;

/**
 * 原料工厂
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
