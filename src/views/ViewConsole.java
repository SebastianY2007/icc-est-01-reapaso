package views;

import Models.Persona;

public class ViewConsole {
    public void printPersonsArray(Persona[] personas){
        for (int i=0; i < personas.length; i++) {
            System.out.print(personas[i] + " || ");
        }System.out.println("");
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
