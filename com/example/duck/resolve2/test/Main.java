package com.example.duck.resolve2.test;

import com.example.duck.resolve2.domain.Duck;
import com.example.duck.resolve2.domain.MallardDuck;
import com.example.duck.resolve2.voar.FlyRockedPowered;

public class Main {
    public static void main(String[] args) {

        Duck d = new MallardDuck();
        d.performFly();
        d.setFlyBehavior(new FlyRockedPowered());
        d.performFly();
        d.performQuack();
    }
}
