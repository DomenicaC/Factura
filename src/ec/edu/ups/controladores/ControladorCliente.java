/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorCliente {
    private Set<Cliente> lista;
    private int codigo;

    public ControladorCliente() {
        lista= new HashSet<>();
        codigo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Cliente objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Cliente read(int codigo){
        for (Cliente cli : lista) {
            if (cli.getCodigo() == codigo) {
                return cli;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public ControladorCliente update(Cliente objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
        return null;
    }
    
    //eliminar un objeto por medio del codigo
    public ControladorCliente delete(int codigo){
        for (Cliente cli : lista) {
            if (cli.getCodigo() == codigo){
                lista.remove(cli);
                break;
            }
        }
        return null;
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Cliente cli : lista) {
            System.out.println(cli.getNombre());
        }
    }

    public Set<Cliente> getLista() {
        return lista;
    }
    
}
