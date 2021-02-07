/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import controlador.listas.ListaS;
/**
 *
 * @author javie
 */
public interface InterfazDao {
    public void guardar(Object o) throws Exception;
    public void eliminar(Object o) throws Exception;
    public Boolean modificar(Object o, int accion);
    public ListaS listar();    
}
