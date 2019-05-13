/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorProducto {
    private Set<Producto> lista;
    private int codigo;

    public ControladorProducto() {
        lista= new HashSet<>();
        codigo = 1;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Producto objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Producto read(int codigo){
        for (Producto prod : lista) {
            if (prod.getCodigo() == codigo) {
                return prod;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Producto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (Producto prod : lista) {
            if (prod.getCodigo() == codigo){
                lista.remove(prod);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Producto prod : lista) {
            System.out.println(prod.getNombre());
        }
    }
}
