package org.app.factory.store;

import org.app.factory.pizza.NYStyleCheesePizza;
import org.app.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
