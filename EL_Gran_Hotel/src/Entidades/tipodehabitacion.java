/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author RodrigoI
 */


public class tipodehabitacion {
    private int codigo;
    private String tipo;
    private int capacidad;
    private int cantcamas;
    private String tipocamas;
    private double precio;

    public tipodehabitacion(int codigo, String tipo, int capacidad, int cantcamas, String tipocamas, double precio) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.cantcamas = cantcamas;
        this.tipocamas = tipocamas;
        this.precio = precio;
    }

    public tipodehabitacion() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantcamas() {
        return cantcamas;
    }

    public void setCantcamas(int cantcamas) {
        this.cantcamas = cantcamas;
    }

    public String getTipocamas() {
        return tipocamas;
    }

    public void setTipocamas(String tipocamas) {
        this.tipocamas = tipocamas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}

