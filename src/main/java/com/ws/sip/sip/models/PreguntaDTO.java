package com.ws.sip.sip.models;

import java.util.ArrayList;
import java.util.List;

public class PreguntaDTO  implements DTOInterface {
    private String enunciado;
    private ArrayList<DTOInterface> opciones = new ArrayList<>();

    public PreguntaDTO(String enunciado, ArrayList<DTOInterface> opciones) {
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<DTOInterface> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<DTOInterface> opciones) {
        this.opciones = opciones;
    }
}

