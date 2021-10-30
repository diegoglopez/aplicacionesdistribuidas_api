package com.ws.sip.sip.models;

import com.ws.sip.sip.utils.Utiles;

import java.util.ArrayList;

public class Pregunta implements EntidadInterface<PreguntaDTO>  {
    private String enunciado;
    private ArrayList<EntidadInterface> opciones = new ArrayList<EntidadInterface>();

    public Pregunta(String enunciado, ArrayList<EntidadInterface> opciones) {
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<EntidadInterface> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<EntidadInterface> opciones) {
        this.opciones = opciones;
    }

    @Override
    public PreguntaDTO toDTO() {
        return new PreguntaDTO(this.enunciado, Utiles.arrayToDto(this.opciones));
    }

}
