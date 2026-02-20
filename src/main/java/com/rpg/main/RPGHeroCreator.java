
package com.rpg.main;

import com.rpg.controller.GameController;
import com.rpg.view.ConsoleView;

// Esta es la clase main, la encargada de que toda la app encienda.

public class RPGHeroCreator {

    public static void main(String[] args) {
        
        //Primero cramos la vista, lo que el usuario ve al inicio.
        ConsoleView view = new ConsoleView();
        
        //Creamos el controlador y le damos a la vista para que interactue de mediador con esta
        GameController game = new GameController(view);
        
        //Iniciamos el juego
        game.start();
        
    }
}
