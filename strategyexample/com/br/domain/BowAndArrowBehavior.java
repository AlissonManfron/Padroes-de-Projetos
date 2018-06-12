package strategyexample.com.br.domain;

import strategyexample.com.br.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Atirar um flacha com um arco!");
    }
}
