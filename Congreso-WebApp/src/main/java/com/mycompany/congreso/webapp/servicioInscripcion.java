/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.congreso.webapp;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Eze
 */
@WebService(serviceName = "servicioInscripcion")
public class servicioInscripcion {

    ArrayList<Evento> eventos = new ArrayList<Evento>() {{
        add(new Evento("Tecnología e innovación en la región"));
        add(new Evento("Introducción a la Programación Orientada a Eventos"));
        add(new Evento("Gestión de Proyectos"));
    }};
    
    @WebMethod(operationName = "obtenerInscriptos")
    public List<Persona> obtenerInscriptos (@WebParam(name = "evento") String evento){
        Evento aux = new Evento("aux");
        for (Evento i : this.eventos){
            if (i.getNombre().equals(evento)){
                aux = i;
            }
        }
        return aux.getPersonas();
    }
    
    @WebMethod(operationName = "inscribirParticipante")
    public String inscribirParticipante (@WebParam(name = "participante") String nombreParticipante, @WebParam(name = "evento") String evento){
        boolean participanteInscripto = false;
        Persona participanteNuevo = new Persona(nombreParticipante);
        for (Evento i : this.eventos){
            if (i.getNombre().equals(evento)){
                i.agregarParticipante(participanteNuevo);
                participanteInscripto = true;
            }
        }
        if (participanteInscripto){
            return (nombreParticipante + " fue registrado en " + evento + ".");
        } else {
            return "Error en el registro";
        }
    }
}
