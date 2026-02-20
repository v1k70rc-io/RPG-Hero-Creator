
package com.rpg.factory;


public class IceFactory implements HeroFactory {

    @Override
    public Weapon createWeapon() {
        return new IceWeapon();
    }

    @Override
    public Armor createArmor() {
        return new IceArmor();
    }
    
}
