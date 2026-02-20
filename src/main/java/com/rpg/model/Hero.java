
package com.rpg.model;


//Implementamos la inerfaz Cloneable para poder habilitar la clonación
public class Hero implements Cloneable {
    
    //Definimos los atributos de un Hero
    private String name;
    private String type;
    private int health;
    private int stamina;
    
    //Hacemos el constructor para poder crear Heros nuevos
    public Hero(String type, int health, int stamina){
        this.type = type;
        this.health = health;
        this.stamina = stamina;
    }
    
    //Hacemos los getters y setters necesarios
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getType(){
        return type;
    }
    
    //Aqui ponemos el método clone que es el corazon del patron prototype, es el boton que dice clonar
    @Override
    public Hero clone(){
        try {
            //Aqui crea una copia exacta en memoria
            return (Hero) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Error: No se pudo clonar el héroe.");
            return null;
        }
    }
    
    //Este método sirve para imprimir los datos del heroe en consola.
    
    @Override
    public String toString(){
        return "Heroe: " + name + " | Clase: " + type + " | Vida: " + health;
    }
         
}
