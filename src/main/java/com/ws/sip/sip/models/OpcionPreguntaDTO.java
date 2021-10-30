package com.ws.sip.sip.models;

public class OpcionPreguntaDTO implements DTOInterface{

    private String descricpion;
    private Integer cantidad;

    public OpcionPreguntaDTO(String descricpion) {
        this.descricpion = descricpion;
    }

    public String getDescricpion() {
        return descricpion;
    }

    public void setDescricpion(String descricpion) {
        this.descricpion = descricpion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
