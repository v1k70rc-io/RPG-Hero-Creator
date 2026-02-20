
package com.rpg.factory;

/*
    Esto es una interfaz, esto define las reglas que deben de seguir las armas, es decir, auque creemos
    una armas de fuego siempre deberia de cumplir las reglas establecidas aqui
*/

public interface Weapon {
    
    //Método para que las armas muestras sus stas
    void showStats();
}
