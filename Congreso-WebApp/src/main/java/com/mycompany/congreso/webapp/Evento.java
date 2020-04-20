/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.congreso.webapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eze
 */
public class Evento {
    private String nombre;
    
    private List<Persona> personas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Evento(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<Persona>();
    }
    
    public void agregarParticipante (Persona participanteNuevo){
        this.personas.add(participanteNuevo);
    }
}
