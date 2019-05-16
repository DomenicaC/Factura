/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

import java.util.List;
import java.util.Date;
import ec.edu.ups.Modelo.FacturaDetalle;
import java.util.ArrayList;

/**
 *
 * @author Domenica Cañizares
 */
public class Factura{
    private double iva;
    private double total;
    private double descuento;
    private int ruc;
    private Date fecha;
    private Cliente cliente;
    private List<FacturaDetalle> detalle;

    public Factura() {
        detalle = new ArrayList<>();
    }

    public Factura(double iva, double total, double descuento, int ruc, Date fecha, Cliente cliente, List<FacturaDetalle> detalle) {
        this.iva = iva;
        this.total = total;
        this.descuento = descuento;
        this.ruc = ruc;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalle = detalle;
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

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FacturaDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<FacturaDetalle> detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.ruc;
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
        final Factura other = (Factura) obj;
        if (this.ruc != other.ruc) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}
