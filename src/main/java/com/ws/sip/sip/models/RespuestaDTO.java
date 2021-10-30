package com.ws.sip.sip.models;

public class RespuestaDTO  implements DTOInterface{

    private Usuario usuario;
    private OpcionPregunta opcionseleccionada;
    private Integer cantidad;

    public RespuestaDTO(Usuario usuario, OpcionPregunta opcionseleccionada) {
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
