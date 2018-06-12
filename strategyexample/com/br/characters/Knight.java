package strategyexample.com.br.characters;

import strategyexample.com.br.domain.AxeBehavior;
import strategyexample.com.br.domain.Character;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Eu sou o Knight e te ataco");
    }
}
