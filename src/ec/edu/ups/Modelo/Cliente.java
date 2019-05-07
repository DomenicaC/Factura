/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

/**
 *
 * @author Domenica Cañizares
 */
public class Cliente {

    private int codigo;
    private String nombre;
    private String cedula;
    private String direcion;
    private String telefono;

    public Cliente() {
    }
    
    //constructor
    public Cliente(int codigo, String nombre, String cedula, String direcion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direcion = direcion;
        this.telefono = telefono;
    }
    
    //set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDirecion() {
        return direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", direcion=" + direcion + ", telefono=" + telefono + '}';
    }
    
    
}
