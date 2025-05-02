package org.app.strategy;

import org.app.strategy.ducks.*;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck duck= new DecoyDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();

        duck = new RubberDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();

        duck = new MallarDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();

        duck = new RedheadDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();
    }

}
