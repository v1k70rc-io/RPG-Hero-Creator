
package com.rpg.view;

import java.util.Scanner;


public class ConsoleView {
    
    private Scanner scanner = new Scanner(System.in);
    
    //Esto muestra mensajes al usuario/jugador
    public void showMessage(String message){
        System.out.println(message);
    }
    
    //Lee lo que el usuario introduce
    public String getInput(String prompt){
        System.out.println(prompt + ": ");
        return scanner.nextLine();
    }
    
}
