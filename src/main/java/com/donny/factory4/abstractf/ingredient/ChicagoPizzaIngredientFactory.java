package com.donny.factory4.abstractf.ingredient;

import com.donny.factory4.abstractf.ingredient.cheese.Cheese;
import com.donny.factory4.abstractf.ingredient.cheese.ParmesanCheese;
import com.donny.factory4.abstractf.ingredient.clams.Clams;
import com.donny.factory4.abstractf.ingredient.clams.FrozenClams;
import com.donny.factory4.abstractf.ingredient.dough.Dough;
import com.donny.factory4.abstractf.ingredient.dough.ThickCrustDough;
import com.donny.factory4.abstractf.ingredient.pepperoni.Pepperoni;
import com.donny.factory4.abstractf.ingredient.pepperoni.SlicedPepperoni;
import com.donny.factory4.abstractf.ingredient.sauce.PlumTomatoSauce;
import com.donny.factory4.abstractf.ingredient.sauce.Sauce;
import com.donny.factory4.abstractf.ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        //厚皮面饼
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //番茄酱料
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        //帕尔马干酪
        return new ParmesanCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        //意大利白干酪、茄子、菠菜、黑橄榄
        Veggies[] veggies = { new Mozarella(), new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        ////切片的意大利辣味香肠
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        //冷冻蛤蜊
        return new FrozenClams();
    }
}
