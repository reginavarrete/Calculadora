/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

/**
 * @author Silvia Guardati
 * Programa 7.1
 * Se define el comportamiento esperado de una pila a través de una interface.
 */
public interface PilaADT <T>{
    public T pop(); // Debe quitar el elemento que está en el tope y regresarlo.
    public void push(T dato); // Agrega el dato en el tope de la pila.
    public T peek(); // Regresa el elemento que está en el tope, sin quitarlo.
    public boolean isEmpty(); // Regresa true si la pila no tiene elementos.  
}
