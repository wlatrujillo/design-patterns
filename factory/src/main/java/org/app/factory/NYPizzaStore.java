package org.app.factory;

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
