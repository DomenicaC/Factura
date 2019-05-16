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
public class FacturaDetalle {
    private Producto prod;
    private int codigo;
    private int cantidad;
    private double subtotal;
    private double total;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Producto prod, int codigo, int cantidad, double subtotal, double total) {
        this.prod = prod;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "prod=" + prod + ", codigo=" + codigo + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", total=" + total + '}';
    }
    
    
    
}
