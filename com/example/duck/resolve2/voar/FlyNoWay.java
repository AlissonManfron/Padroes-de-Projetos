package com.example.duck.resolve2.voar;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
