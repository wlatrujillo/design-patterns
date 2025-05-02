package org.app.decorator.condiments;

import org.app.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
