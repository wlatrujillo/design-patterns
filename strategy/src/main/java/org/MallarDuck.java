package org;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehaivor = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
