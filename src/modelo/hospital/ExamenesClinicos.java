/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.hospital;

import java.util.Date;

/**
 *
 * @author Maria
 */
public class ExamenesClinicos {
    Date fecha;
    String informacion;

    public ExamenesClinicos() {
    }

    public ExamenesClinicos(Date fecha, String informacion) {
        this.fecha = fecha;
        this.informacion = informacion;
    }

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    
}
