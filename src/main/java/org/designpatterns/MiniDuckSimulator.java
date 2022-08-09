package org.designpatterns;

import org.strategy.app.Duck;
import org.strategy.app.MallarDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard= new MallarDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
