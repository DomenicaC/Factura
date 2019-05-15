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
public class Factura {
    private double iva;
    private double total;
    private double descuento;
    private int codigo;

    public Factura() {
    }

    public Factura(double iva, double total, double descuento, int codigo) {
        this.iva = iva;
        this.total = total;
        this.descuento = descuento;
        this.codigo = codigo;
    }
    
    
}
