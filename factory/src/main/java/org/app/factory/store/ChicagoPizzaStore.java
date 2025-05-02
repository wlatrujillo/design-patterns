package org.app.factory.store;

import org.app.factory.pizza.ChicagoStyleCheesePizza;
import org.app.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
