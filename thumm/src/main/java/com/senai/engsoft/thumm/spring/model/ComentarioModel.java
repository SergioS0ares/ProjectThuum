package com.senai.engsoft.thumm.spring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "comments_model")
public class ComentarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idComentario;

    @Column(name = "id_usuario_comentario")
    private UUID idUsuarioComentario;

    @Column(name = "data")
    private Date data;

    @Column(name = "comentario")
    private String comentario;

    // Construtor padrão
    public ComentarioModel() {
        this.idComentario = UUID.randomUUID();
        this.data = new Date();
    }

    // Getters e Setters

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

    // Método para formatar a data, se necessário
    public String formatarData() {
        // Código para formatar a data, se necessário
        return null;
    }
}
