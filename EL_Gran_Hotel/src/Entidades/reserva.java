/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author RodrigoI
 */
public class reserva {
    private habitacion nrohabitacion;
    private huesped idHuesped;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private double ImporteTotal;
    private boolean estado;

    public reserva() {
    }

    public reserva(habitacion nrohabitacion, huesped idHuesped, LocalDate FechaEntrada, LocalDate FechaSalida, double ImporteTotal, boolean estado) {
        this.nrohabitacion = nrohabitacion;
        this.idHuesped = idHuesped;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.ImporteTotal = ImporteTotal;
        this.estado = estado;
    }

    public habitacion getNrohabitacion() {
        return nrohabitacion;
    }

    public void setNrohabitacion(habitacion nrohabitacion) {
        this.nrohabitacion = nrohabitacion;
    }

    public huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(double ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
