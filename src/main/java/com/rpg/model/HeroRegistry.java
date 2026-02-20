
package com.rpg.model;

import java.util.HashMap;
import java.util.Map;

/*
    El sentido de utilizar el HeroRegistry es que cuando querramos crear un nuevo heroe, ya tengamos plantillas predefinidas para no tener que hacerlos cada
    uno desde cero, HeroRegistrity es como el catalogo donde se ecnuentran las diferentes plantillas y podes escogerlas desde aqui. Por ejemplo, si queremos hacer 
    un mago no lo hacemos desde cero, ya existe un prototipo de como se debe de ver un mago, ya luego nosotros le haremos los cambios minimos.
*/

public class HeroRegistry {
    
    //Este es el mapa donde guardaremos los diferentes prototipos que realizemos.
    private Map<String, Hero> prototypes = new HashMap<>();
    
    public HeroRegistry() {
        
        //Creamos los heroes base y los guardamos en el catalogo
        Hero warriorBase = new Hero("Guerrero", 150, 50);
        Hero mageBase = new Hero("Mago", 80, 150);
        
        prototypes.put("warrior", warriorBase);
        prototypes.put("mage", mageBase);
    }
    
    /*
        Método que utilizara el usuario para obtener un nuevo heroes
    */
    public Hero getHero(String type){
        //Aqui buscamos en el mapa usando el nombre del prototipo e ingoramos si el usuario introduce mayuscululas o minusculas.
        Hero prototype = prototypes.get(type.toLowerCase());
        
        //Manejo de errores, si el usuario pide un ninja y este prototipo no existe, le devolveremos un null
        if (prototype != null){
            //Devolvemos una COPIA del prototipo que es escogio
            return prototype.clone();
        }
        //Le devolvemos null para dar a entender de que lo que el escogio no existe.
        return null;
    }
}
