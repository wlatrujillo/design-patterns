package org.app.strategy.ducks;

import org.app.strategy.behavior.FlyBehavior;
import org.app.strategy.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehaivor;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaivor.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
