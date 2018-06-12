package com.example.duck.resolve1.test;

import com.example.duck.resolve1.domain.DecoyDuck;
import com.example.duck.resolve1.domain.Duck;
import com.example.duck.resolve1.domain.MallardDuck;

public class Main {
    public static void main(String[] args) {

        MallardDuck d = new MallardDuck();

        d.Fly();
        d.display();
        d.swim();
    }
}
