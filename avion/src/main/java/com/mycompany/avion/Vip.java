/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

/**
 *
 * @author David
 */
public class Vip {
    
    private String ubicacion;
    private String estado;
    public Persona per;

    public Vip(String ubicacion, String estado, Persona per) {
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.per = per;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }
    
}
