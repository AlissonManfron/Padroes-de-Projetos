package strategyexample.com.br.domain;

import strategyexample.com.br.interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cortar com uma faca!");
    }
}
