package com.company;

public class TributeDuck extends Duck {
    public TributeDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I’m not the best duck, im just a tribute");
    }
}