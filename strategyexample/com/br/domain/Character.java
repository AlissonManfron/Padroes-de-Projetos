package strategyexample.com.br.domain;

import strategyexample.com.br.interfaces.WeaponBehavior;

public abstract class Character {

    public Character(){}

    public WeaponBehavior weaponBehavior;

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){weaponBehavior.useWeapon();}

    public abstract void fight();
}
