package strategyexample.com.br.test;

import strategyexample.com.br.characters.Knight;
import strategyexample.com.br.characters.Troll;
import strategyexample.com.br.domain.BowAndArrowBehavior;
import strategyexample.com.br.domain.Character;

public class Main {
    public static void main(String[] args) {

        Character character = new Troll();
        character.fight();
        Character character1 = new Knight();
        character1.fight();
        character1.performWeapon();
        character.setWeapon(new BowAndArrowBehavior());
        character.fight();

    }
}
