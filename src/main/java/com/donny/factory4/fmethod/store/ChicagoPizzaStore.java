package com.donny.factory4.fmethod.store;

import com.donny.factory4.fmethod.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)){
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(type)){
            return new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)){
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
