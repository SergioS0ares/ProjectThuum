package com.thuum.main.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Comment {

    // atributos

    private UUID idComentario;
    private UUID idUsuarioComentario;
    private Date data;
    private String comentario;

    // construtor

    public Comment() {
        this.idComentario = UUID.randomUUID();
        this.data = new Date();
    }
    public Comment(UUID id) {
    	this.idComentario = UUID.randomUUID();
    	this.data = new Date();
    	this.idUsuarioComentario = id;
    }
    public Comment(UUID id, String text) {
    	this.idUsuarioComentario = id;
    	this.data = new Date();
    	this.comentario = text;
    }

    // getters e setters

    public UUID getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(UUID idComentario) {
        this.idComentario = idComentario;
    }

    public UUID getIdUsuarioComentario() {
        return idUsuarioComentario;
    }

    public void setIdUsuarioComentario(UUID idUsuarioComentario) {
        this.idUsuarioComentario = idUsuarioComentario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    // método para formatar a data
    public String formatarData() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
    
}
