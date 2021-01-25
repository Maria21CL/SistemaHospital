/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.listas.ListaS;
import modelo.Paciente;

/**
 *
 * @author Maria
 */
public class registrarPaciente {
    private ListaS lista = new ListaS();
    
    private Paciente paciente = new Paciente();

    public ListaS getLista() {
        return lista;
    }

    public void setLista(ListaS lista) {
        this.lista = lista;
    }

    
    public Paciente getPaciente() {
        if (paciente == null) 
            this.paciente = new Paciente();
        return paciente;
    }

    public void setEstudiante(Paciente paciente) {
        this.paciente = paciente;
    }

    
    public Boolean guardarEstudiante(){
        try {
             lista.insertar(getPaciente());
             return true;
        } catch (Exception e) {
            System.out.println("Dato null"+e);
            return false;
        }
       
    }
}
