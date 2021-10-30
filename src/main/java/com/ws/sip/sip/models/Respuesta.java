package com.ws.sip.sip.models;

public class Respuesta implements EntidadInterface<RespuestaDTO> {
    private Usuario usuario;
    private OpcionPregunta opcionseleccionada;

    public Respuesta(Usuario usuario, OpcionPregunta opcionseleccionada) {
        this.usuario = usuario;
        this.opcionseleccionada = opcionseleccionada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public OpcionPregunta getOpcionseleccionada() {
        return opcionseleccionada;
    }

    public void setOpcionseleccionada(OpcionPregunta opcionseleccionada) {
        this.opcionseleccionada = opcionseleccionada;
    }

    @Override
    public RespuestaDTO toDTO() {
        return new RespuestaDTO(this.usuario, this.opcionseleccionada);
    }
}
