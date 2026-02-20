
package com.rpg.controller;

//Importamos todos los packages

import com.rpg.config.GameSettings;
import com.rpg.factory.*;
import com.rpg.model.*;
import com.rpg.view.ConsoleView;

// El controlador lo podemos ver como el cerebro que permite que los datos (modelo) se comuniquen con la vista

public class GameController {
    
    private ConsoleView view;
    private HeroRegistry registry;
    private GameSettings settings;
    
    //Conastructor de nuestro controlador
    public GameController(ConsoleView view){
        //Le pasamos la vista
        this.view = view;
        
        //Le pasamos el catelogo de heroes registrados
        this.registry = new HeroRegistry();
        
        //Le pasamos la unica instancia de las configuraciones del juego
        this.settings = GameSettings.getInstance();
    }
    
    public void start(){
        view.showMessage("---Bienvenido a " + settings.getGameName() + "---");
        
        //Aqui elegimos al heroe de nuestra preferencia
        String type = view.getInput("Escribe el nombre de la clase que prefieras: Warrior / Mage");
        Hero player = registry.getHero(type);
        
        //Si la clase que eligio no existe
        if (player == null){
            view.showMessage("Clase no valida, por favor elige una clase valida");
            return;
        }
        
        //Le pedimos un nombre para su heroe
        String name = view.getInput("Ponle un nombre a tu héroe: ");
        player.setName(name);
        
        //Elegimos el elemento del heroe
        String element = view.getInput("Escribe el elemento de tu héroe: Fire/Ice");
        HeroFactory factory;
        
        //Le asignamos una fabrica segun el elemento que escoja
        if (element.equalsIgnoreCase("fire")){
            factory = new FireFactory();
        } else{
            factory = new IceFactory();
        }
        
        //Creamos un kit de equipamento segun el elemento que escogio
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        
        //Mostramos como se ve el heroe ya construido.
        view.showMessage("\n --- Héroe Creado --- \n");
        view.showMessage(player.toString());
        weapon.showStats();
        armor.showProtection();
        
    }
    
}
