package com.ws.sip.sip.models;

public class OpcionPregunta implements EntidadInterface<OpcionPreguntaDTO> {

    private String descricpion;

    public OpcionPregunta(String descricpion) {
        this.descricpion = descricpion;
    }

    public String getDescricpion() {
        return descricpion;
    }

    public void setDescricpion(String descricpion) {
        this.descricpion = descricpion;
    }

    @Override
    public OpcionPreguntaDTO toDTO() {
        return new OpcionPreguntaDTO(this.descricpion);
    }
}
