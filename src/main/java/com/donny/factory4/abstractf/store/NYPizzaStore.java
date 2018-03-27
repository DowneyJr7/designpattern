package com.donny.factory4.abstractf.store;

import com.donny.factory4.abstractf.ingredient.NYPizzaIngredientFactory;
import com.donny.factory4.abstractf.ingredient.PizzaIngredientFactory;
import com.donny.factory4.abstractf.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
