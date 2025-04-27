package org;

import java.awt.*;

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
