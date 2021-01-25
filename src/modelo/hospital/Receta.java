/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.hospital;

/**
 *
 * @author Maria
 */
public class Receta {
    String nombre;
    String informacion;

    public Receta() {
    }

    public Receta(String nombre, String informacion) {
        this.nombre = nombre;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    
}
