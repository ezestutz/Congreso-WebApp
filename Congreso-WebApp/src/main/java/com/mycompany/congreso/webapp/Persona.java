/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.congreso.webapp;

/**
 *
 * @author Eze
 */
public class Persona {
    private String nombreCompleto;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}