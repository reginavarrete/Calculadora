/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

/**
 * @author Silvia Guardati
 * Programa 6.4
 * Se define una clase propia para el manejo de excepción en los casos que la 
 * colección o estructura de datos esté vacía.
 */
public class ExcepciónColecciónVacía extends RuntimeException{

    public ExcepciónColecciónVacía(){
        super("Colección vacía");
    }

    public ExcepciónColecciónVacía(String mensaje){
        super(mensaje);
    }
}
