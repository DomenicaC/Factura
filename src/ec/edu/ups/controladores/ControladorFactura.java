/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Factura;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFactura {
    
    private Set<Factura> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    
    public ControladorFactura() {
        lista= new HashSet<>();
        codigo = 0;
    }
    
    public String getFecha(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaT = formatoFecha.format(fecha.getTime());
        return fechaT;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Factura objeto){
        codigo ++;
        objeto.setRuc(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Factura read(int codigo){
        for (Factura fac : lista) {
            if (fac.getRuc()== codigo) {
                return fac;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public ControladorFactura update(Factura objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
        return null;
    }
    
    //eliminar un objeto por medio del codigo
    public ControladorFactura delete(int codigo){
        for (Factura fac : lista) {
            if (fac.getRuc()== codigo){
                lista.remove(fac);
                break;
            }
        }
        return null;
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Factura fac : lista) {
            System.out.println(fac.getRuc());
        }
    }

    public Set<Factura> getLista() {
        return lista;
    }
}
