package com.thuum.main.classes;

import java.util.List;
import java.util.UUID;

public abstract class Tarefas {

    // atributos

    UUID idUsuarioVinculado;
    UUID idUsuarioLogado;
    UUID idTarefa;
    List<UUID> idUsuariosAssistentes;
    List<UUID> idCheckBoxes;
    String nome;
    String descricao;
    CheckBox checkbox;
    List<Comment> comentarios;

    // Getters e Setters

    public UUID getIdUsuarioVinculado() {
        return idUsuarioVinculado;
    }

    public void setIdUsuarioVinculado(UUID idUsuarioVinculado) {
        this.idUsuarioVinculado = idUsuarioVinculado;
    }

    public UUID getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(UUID idTarefa) {
        this.idTarefa = idTarefa;
    }

    public List<UUID> getIdUsuariosAssistentes() {
        return idUsuariosAssistentes;
    }

    public void setIdUsuariosAssistentes(List<UUID> list) {
        this.idUsuariosAssistentes = list;
    }
    
    public void addIdUsuarioAssistente(UUID id) {
    	this.idUsuariosAssistentes.add(id);
    }
    
    public void delIdUsuariosAssistentes(UUID id) {
    	this.idUsuariosAssistentes.remove(id);
    }
    
    public void setIdCheckBoxes(List<UUID> list) {
    	this.idCheckBoxes = list;
    }
    
    public void addIdCheckBoxes(UUID id) {
    	this.idCheckBoxes.add(id);
    }
    
    public void delIdCheckBoxes(UUID id) {
    	this.idCheckBoxes.remove(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CheckBox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(CheckBox checkbox) {
        this.checkbox = checkbox;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }
    
    public List<UUID> getIdCheckBoxes(){
    	return idCheckBoxes;
    }
    
    public String getIdCheckBoxesOnSring() {
    	String text = "";
    	for (int x = 0; x <= idCheckBoxes.size(); x = x + 1) {
    		text = text + idCheckBoxes.get(x) + ", ";
    	}
    	return text;
    }

    public void setComentarios(List<Comment> comentarios) {
        this.comentarios = comentarios;
    }
    
    public void addComentarios(Comment comment) {
    	this.comentarios.add(comment);
    }
    
    public void delComentarios(Comment comment) {
    	Comment comm = new Comment(idUsuarioLogado);
    	this.comentarios.add(comm);
    }
    
    public String getComentariosId_IdUserOnString() {
    	String text = "";
    	for (int x = 0; x <= comentarios.size(); x = x + 1) {
    		text = text + comentarios.get(x).getIdComentario() + "/" + comentarios.get(x).getIdUsuarioComentario() + ",";
    	}
    	return text;
    }
    
}
