package com.example.duck.resolve1.voar;

import com.example.duck.resolve1.domain.Duck;

public class FlyWithWings extends Duck implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("fly with wings");
    }
}
