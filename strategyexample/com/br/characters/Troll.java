package strategyexample.com.br.characters;

import strategyexample.com.br.domain.Character;
import strategyexample.com.br.domain.KnifeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Eu sou o Trool e te ataco");
        weaponBehavior.useWeapon();
    }
}
