package org.app.strategy.ducks;

import org.app.strategy.behavior.fly.FlyNoWay;
import org.app.strategy.behavior.quack.MuteQuack;
import org.app.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehaivor = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
