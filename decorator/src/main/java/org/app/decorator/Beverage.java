package org.app.decorator;

public abstract class Beverage {
    String description = "";

    public String getDescription(){
        return this.description;
    }
    public abstract double cost();
}
