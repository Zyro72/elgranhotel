/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author perey
 */
public class huesped {
    
    private int idHuesped;
    private int Dni;
    private char Apellidoynom;
    private char Direccion;
    private char Correo;
    private char Celular;
    private boolean Estado;
    
    public huesped() {
             
}
    public huesped (int Dni, char Apellidoynom, char Direccion, char Correo, char Celular, boolean Estado){
        this.Dni = Dni;
        this.Apellidoynom = Apellidoynom;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado; 
    }
    public huesped(int idHuesped, int Dni, char Apellidoynom, char Direccion, char Correo, char Celular, boolean Estado) {
        this.idHuesped = idHuesped;
        this.Dni = Dni;
        this.Apellidoynom = Apellidoynom;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public char getApellidoynom() {
        return Apellidoynom;
    }

    public void setApellidoynom(char Apellidoynom) {
        this.Apellidoynom = Apellidoynom;
    }

    public char getDireccion() {
        return Direccion;
    }

    public void setDireccion(char Direccion) {
        this.Direccion = Direccion;
    }

    public char getCorreo() {
        return Correo;
    }

    public void setCorreo(char Correo) {
        this.Correo = Correo;
    }

    public char getCelular() {
        return Celular;
    }

    public void setCelular(char Celular) {
        this.Celular = Celular;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    @Override
      public String toString() {
        return idHuesped +" -"+Dni+" -"+ Apellidoynom+"- "+Estado;
      }
    
    
}
