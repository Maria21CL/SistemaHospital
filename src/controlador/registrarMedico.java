/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.listas.ListaS;
import modelo.Medico;

/**
 *
 * @author Maria
 */
public class registrarMedico {
    private ListaS lista = new ListaS();
    
    private Medico medico = new Medico();

    public ListaS getLista() {
        return lista;
    }

    public void setLista(ListaS lista) {
        this.lista = lista;
    }

    
    public Medico getMedico() {
        if (medico == null) 
            this.medico = new Medico();
        return medico;
    }

    public void setEstudiante(Medico medico) {
        this.medico = medico;
    }

    
    public Boolean guardarMedico(){
        try {
             lista.insertar(getMedico());
             return true;
        } catch (Exception e) {
            System.out.println("Dato null"+e);
            return false;
        }
       
    }
}
