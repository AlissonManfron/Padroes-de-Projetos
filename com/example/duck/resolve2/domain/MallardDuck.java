package com.example.duck.resolve2.domain;

import com.example.duck.resolve2.grasnar.Quack;
import com.example.duck.resolve2.voar.FlyNoWay;
import com.example.duck.resolve2.voar.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Eu sou o pato verdadeiro!");
    }
}
