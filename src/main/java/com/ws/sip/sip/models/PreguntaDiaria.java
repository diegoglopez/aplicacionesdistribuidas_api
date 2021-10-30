package com.ws.sip.sip.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PreguntaDiaria {
    private String descripcion;
    private Pregunta pregunta;
    private ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();

    public PreguntaDiaria(String descripcion, ArrayList<Respuesta> respuestas) {
        this.descripcion = descripcion;
        this.respuestas = respuestas;
    }

    public ArrayList<OpcionPreguntaDTO> cantidaddeRespuestas(){
        ArrayList<OpcionPreguntaDTO> respuestasdto = new ArrayList<OpcionPreguntaDTO>();
        ArrayList<OpcionPregunta> opciones = new ArrayList<>();
        Map<String, Integer> groupingMap = new HashMap<>();

        pregunta.getOpciones().forEach((e) -> opciones.add((OpcionPregunta)e));

        respuestas.forEach((e) -> {
                    e.getOpcionseleccionada();

                }
        );

        return respuestasdto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
