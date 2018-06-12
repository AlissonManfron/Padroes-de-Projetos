package com.example.duck.resolve2.grasnar;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack de verdade!");
    }
}
