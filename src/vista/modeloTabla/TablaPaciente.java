/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.listas.ListaS;
import javax.swing.table.AbstractTableModel;
import modelo.Paciente;

/**
 *
 * @author javie
 */
public class TablaPaciente extends AbstractTableModel{
    private ListaS lista = new ListaS();

    public ListaS getLista() {
        return lista;
    }

    public void setLista(ListaS lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public int getRowCount() {
        return lista.tamano();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Paciente e = (Paciente)lista.obtenerPorPosicion(i);
        switch(i1) {
            case 0: return i+1;
            case 1: return e.getCedula();
            case 2: return e.getNombre()+ " " + e.getApellido();
            case 3: return e.getTelefono();
            case 4: return e.getCiudad();
            case 5: return e.getSexo();
            case 6: return e.getFecha_entrada();
            case 7: return e.getPatologia();  
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Nro";
            case 1: return "CEDULA";
            case 2: return "PACIENTE";
            case 3: return "TELEFONO";
            case 4: return "CIUDAD";
            case 5: return "SEXO";
            case 6: return "FECHA";
            case 7: return "PATOLOGÍA";
            default:return null;
        }
    }
}
