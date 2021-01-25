/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.listas;


/**
 *
 * @author javie
 */
public class Nodo {
    private Nodo Siguiente;
    private Object dato;

    // Constructor para insertar al final
//    public Nodo() {
//        dato = null;
//        Siguiente = null;
//    }
//Constructor para Insertar al inicio
    public Nodo(Object dato, Nodo sig) {
        this.dato = dato;
        this.Siguiente = sig;
    }
    
    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
}
