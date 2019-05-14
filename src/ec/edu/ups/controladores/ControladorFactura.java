/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Factura;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFactura {
    private int codigo;
    public ControladorFactura() {
        codigo = 0;
    }
    /*
    //crear un num=evo objeto en la lista
    public void create(Factura objeto){
        codigo ++;
        //objeto.setCodigo(codigo);
        //lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Factura read(int codigo){
        for (Factura fac : lista) {
            if (cli.getCodigo() == codigo) {
                return cli;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Factura objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (Factura fac : lista) {
            if (fac.getCodigo() == codigo){
                lista.remove(fac);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Cliente cli : lista) {
            System.out.println(cli.getNombre());
        }
    }

    public Set<Cliente> getLista() {
        return lista;
    }*/
}
