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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Factura{" + "iva=" + iva + ", total=" + total + ", descuento=" + descuento + ", codigo=" + codigo + '}';
    }
    
    
}
