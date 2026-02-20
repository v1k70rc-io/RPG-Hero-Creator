
package com.rpg.factory;


/*
    Esta es la fabrica abstacta, no sabe si la arma o armadura que esta haciendo es de fuego o hielo, solo sabe que tiene que hacer un arma y armadura
*/

public interface HeroFactory {
    
    Weapon createWeapon();
    Armor createArmor();
}
