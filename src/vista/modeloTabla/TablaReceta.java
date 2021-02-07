/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.listas.ListaS;
import javax.swing.table.AbstractTableModel;
import modelo.Receta;

/**
 *
 * @author javie
 */
public class TablaReceta extends AbstractTableModel{
     private ListaS lista = new ListaS();

    public ListaS getLista() {
        return lista;
    }

    public void setLista(ListaS lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return lista.tamano();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Receta e = (Receta)lista.obtenerPorPosicion(i);
        switch(i1) {
            case 0: return i+1;
            case 1: return e.getNombre();
            case 2: return e.getCantidad();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "NRO RECETA";
            case 1: return "NOMBRE";
            case 2: return "CANTIDAD";
            
            default:return null;
        }
    }
}
