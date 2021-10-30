package com.ws.sip.sip.models;

public class Noticia implements EntidadInterface<NoticiaDTO> {
    private String titulo;
    private String texto;
    private String imagen;

    public Noticia(String titulo, String texto, String imagen) {
        this.titulo = titulo;
        this.texto = texto;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public NoticiaDTO toDTO() {
        return new NoticiaDTO(this.titulo,this.texto,this.imagen);
    }
}
