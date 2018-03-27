package com.donny.factory4.abstractf.ingredient;

import com.donny.factory4.abstractf.ingredient.cheese.Cheese;
import com.donny.factory4.abstractf.ingredient.cheese.ReggianoCheese;
import com.donny.factory4.abstractf.ingredient.clams.Clams;
import com.donny.factory4.abstractf.ingredient.clams.FreshClams;
import com.donny.factory4.abstractf.ingredient.dough.Dough;
import com.donny.factory4.abstractf.ingredient.dough.ThinCrustDough;
import com.donny.factory4.abstractf.ingredient.pepperoni.Pepperoni;
import com.donny.factory4.abstractf.ingredient.pepperoni.SlicedPepperoni;
import com.donny.factory4.abstractf.ingredient.sauce.MarinaraSauce;
import com.donny.factory4.abstractf.ingredient.sauce.Sauce;
import com.donny.factory4.abstractf.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        //薄皮面饼
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //大蒜酱料
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        //巴马干酪
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        //大蒜、洋葱、蘑菇、红椒
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        //切片的意大利辣味香肠
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        //新鲜蛤蜊
        return new FreshClams();
    }
}
