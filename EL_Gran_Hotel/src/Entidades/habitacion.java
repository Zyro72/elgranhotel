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
public class habitacion {
 private int numero;
 private tipodehabitacion tipohabitacion;
 private int piso;
 private boolean estado;

    public habitacion(int numero, tipodehabitacion tipohabitacion, int piso, boolean estado) {
        this.numero = numero;
        this.tipohabitacion = tipohabitacion;
        this.piso = piso;
        this.estado = estado;
    }

    public habitacion() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public tipodehabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(tipodehabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 
 
    public String toString(){
        
        String aux=""+numero;
        return aux ;
    }
    
}
