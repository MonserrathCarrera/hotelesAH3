/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelesah3;

import java.util.LinkedList;

/**
 *
 * @author monse
 */
public class Usuario {
      static LinkedList<Usuario> usuario=new LinkedList< > ();
    private int telefono;
    private String nombre;
    private String apellido;
        private String Direccion;
           private String correo;
            private String fecha_nacimiento;
    private String contraseña;

    public static LinkedList<Usuario> getUsuario() {
        return usuario;
    }

    public static void setUsuario(LinkedList<Usuario> usuario) {
        Usuario.usuario = usuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(int telefono, String nombre, String apellido, String Direccion, String correo, String fecha_nacimiento, String contraseña) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Direccion = Direccion;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contraseña = contraseña;
    }
    
}
  