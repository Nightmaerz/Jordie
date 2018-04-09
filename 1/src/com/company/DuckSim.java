package com.company;

public class DuckSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck tributeduck = new TributeDuck();
        tributeduck.performFly();
        tributeduck.setFlyBehavior(new FlyRocketPowered());
        tributeduck.performFly();
    }
}
