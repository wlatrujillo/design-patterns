package org.app.strategy.ducks;

import org.app.strategy.behavior.fly.FlyNoWay;
import org.app.strategy.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehaivor = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Decoy Duck");
    }
}
