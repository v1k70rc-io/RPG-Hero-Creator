
package com.rpg.factory;

/*
    Esta es la fabrica fuego, esta si sabe que todo lo que debe de devolver es fuego
*/

public class FireFactory implements HeroFactory {

    @Override
    public Weapon createWeapon() {
        return new FireWeapon();
    }

    @Override
    public Armor createArmor() {
        return new FireArmor();
    }
    
}
