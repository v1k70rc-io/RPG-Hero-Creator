
package com.rpg.config;


    public class GameSettings {

        //La unica instancia que existira
        private static GameSettings instance;

        //Atributos de la configuración
        private String gameName;
        private String difficulty;

        //Constructor privado para que nadie afuera de esta clase pueda instanciar la clase con new()
        private GameSettings(){
            this.gameName = "RPG Legend";
            this.difficulty = "Normal";
        }

        //Método estatico, la manera de obtener la unica instancia
        public static GameSettings getInstance(){
            //Verificamos si la instancia ya existe, si no existe la creamos
            if(instance == null){
                instance = new GameSettings();
            }
            //Si la instancia ya existe solo la devolvemos
            return instance;
        }

        //Getter y Setters para modificar el nombre del juego y su dificultad

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

    }
