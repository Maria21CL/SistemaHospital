/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javie
 */
public class Persona {
    public Long IdMedico,IdPaciente;
    public String nombre;
    public String apellido;
    public String direccion;
    public String correo;
    public String tipo;
    public int telefono;
    public int cedula;
    private String Fecha_entrada;
    private String Sexo;
    private String Ciudad;
    private String Patologia;
    Rol rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(Long IdMedico) {
        this.IdMedico = IdMedico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Long getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(Long IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFecha_entrada() {
        return Fecha_entrada;
    }

    public void setFecha_entrada(String Fecha_entrada) {
        this.Fecha_entrada = Fecha_entrada;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String Patologia) {
        this.Patologia = Patologia;
    }


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
