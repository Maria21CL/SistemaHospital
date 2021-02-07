/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import com.thoughtworks.xstream.XStream;
import controlador.listas.ListaS;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author javie
 */
public class AdaptadorDao implements InterfazDao {

    private Conexion conexion;
    private Class clazz;

    public AdaptadorDao(Conexion conexion, Class clazz) {
        this.conexion = conexion;
        this.clazz = clazz;
    }

    @Override
    public void guardar(Object o) throws Exception {
        ListaS lista = listar();
        lista.insertar(o);
        conexion.getXtrStream().toXML(lista, new FileOutputStream(conexion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json"));

    }

    @Override
    public Boolean modificar(Object o, int accion) {
        if (accion == 0) {
            ListaS lista = listar();
            lista.editar(accion, o);
            conexion.getXtrStream().toXML(lista);

        }
        return false;
    }

    @Override
    public ListaS listar() {
        ListaS lista = new ListaS();
        try {
            lista = (ListaS) conexion.getXtrStream().fromXML(new FileReader(conexion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json"));
            //Object obj = xtrStream.fromXML(new FileReader(url+File.separatorChar+"horario.json") );

        } catch (Exception e) {
            System.out.println("No se pudo listar " + e);
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void eliminar(Object o) throws Exception {
        ListaS lista = listar();
        lista.EliminarXDato((String) o);
        conexion.getXtrStream().toXML(lista, new FileOutputStream(conexion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json"));

    }
}
