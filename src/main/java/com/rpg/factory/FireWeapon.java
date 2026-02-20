
package com.rpg.factory;


public class FireWeapon implements Weapon {

    @Override
    public void showStats() {
        System.out.println("Espada de Fuego: +50 de daño de quemadura.");
    }
}
