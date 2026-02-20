
package com.rpg.factory;


public class IceWeapon implements Weapon {

    @Override
    public void showStats() {
        System.out.println("Daga de Hielo: +40 de daño de congelación.");
    }
    
}
