/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.hospital;

/**
 *
 * @author javie
 */
public class HistorialClinico {
    String informacion;

    public HistorialClinico(String informacion) {
        this.informacion = informacion;
    }

    
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
