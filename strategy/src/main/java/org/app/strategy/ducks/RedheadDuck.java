package org.app.strategy.ducks;

import org.app.strategy.behavior.fly.FlyWithWings;
import org.app.strategy.behavior.quack.Quack;
import org.app.strategy.behavior.quack.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehaivor = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
