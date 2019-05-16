/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFacDetalle {
    private Set<FacturaDetalle> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public ControladorFacDetalle() {
        lista= new HashSet<>();
        codigo = 0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(FacturaDetalle objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public FacturaDetalle read(int codigo){
        for (FacturaDetalle fac : lista) {
            if (fac.getCodigo()== codigo) {
                return fac;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public ControladorFactura update(FacturaDetalle objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
        return null;
    }
    
    //eliminar un objeto por medio del codigo
    public ControladorFactura delete(int codigo){
        for (FacturaDetalle fac : lista) {
            if (fac.getCodigo()== codigo){
                lista.remove(fac);
                break;
            }
        }
        return null;
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (FacturaDetalle fac : lista) {
            System.out.println(fac.getCodigo());
        }
    }

    public Set<FacturaDetalle> getLista() {
        return lista;
    }
}
