package org.app.decorator;

import org.app.decorator.beverages.Beverage;
import org.app.decorator.beverages.DarkRoast;
import org.app.decorator.beverages.Espresso;
import org.app.decorator.beverages.HouseBlend;
import org.app.decorator.condiments.Mocha;
import org.app.decorator.condiments.Soy;
import org.app.decorator.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage expresso = new Espresso();
        System.out.println(expresso.getDescription() + " $" + expresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast=new Mocha(darkRoast);
        darkRoast=new Mocha(darkRoast);
        darkRoast=new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }

}
